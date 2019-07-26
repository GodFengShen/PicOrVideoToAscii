package albion.linecutfeng.videotoascii.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

import albion.linecutfeng.videotoascii.activity.AsciiActivity;
import albion.linecutfeng.videotoascii.app.AppConfig;

public class EncodeThread extends Thread {

    private OnEncoderListener onEncoderListener;
    private String path;
    private int fps;
    Handler mHandler = new Handler(Looper.getMainLooper());

    int encodeTotalCount;
    MediaDecoder mediaDecoder;
    private Bitmap bitmapTemp;
    WeakReference<Context> weakReference;
    boolean isColorful;

    public EncodeThread(String path, int fps, OnEncoderListener onEncoderListener, AsciiActivity asciiActivity, boolean isColorful) {
        this.fps = fps;
        this.path = path;
        this.onEncoderListener = onEncoderListener;
        weakReference = new WeakReference(asciiActivity);
        this.isColorful = isColorful;
    }

    @Override
    public void run() {
        mediaDecoder = new MediaDecoder(path);
        String videoFileLength = mediaDecoder.getVideoFileLength();
        if (videoFileLength != null) {
            try {
                int length = Integer.parseInt(videoFileLength);
                encodeTotalCount = length / (1000 / fps);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < encodeTotalCount; i++) {
            Log.i("icv", "第" + i + "张解码开始----------------\n");
            Bitmap bitmap = mediaDecoder.decodeFrame(i * (1000 / fps));
            if (bitmap == null) continue;
            Log.i("icv", "第" + i + "张解码结束\n");
            Log.i("icv", "第" + i + "张转换开始\n");
            if (weakReference == null || weakReference.get() == null) return;
            bitmapTemp = CommonUtil.createAsciiByDrawText(bitmap, weakReference.get(), isColorful);
            Log.i("icv", "第" + i + "张转换结束\n");
            Log.i("icv", "第" + i + "张编码结束----------------\n\n");
            FileOutputStream fos;
            try {
                String format = String.format("%05d", i);
                fos = new FileOutputStream(AppConfig.PIC_LIST_PATH + File.separator + "test" + format + ".png", false);
                bitmapTemp.compress(Bitmap.CompressFormat.PNG, 100, fos);
                fos.flush();
                fos.close();
                if (onEncoderListener != null) {
                    onEncoderListener.onProgress(((int) (100 * ((float) i / encodeTotalCount))));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    if (onEncoderListener != null) {
                        onEncoderListener.showImg(bitmapTemp);
                    }
                }
            });
        }
        Log.i("icv", "处理完成");
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (onEncoderListener != null) {
                    onEncoderListener.onComplish();
                }
            }
        });

    }

    public interface OnEncoderListener {
        void onProgress(int progress);

        void onComplish();

        void showImg(Bitmap bitmapTemp);
    }
}
