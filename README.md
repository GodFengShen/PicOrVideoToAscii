PlayPicdio
-----
简书：
</br>
https://www.jianshu.com/p/a14f1ac558e1
</br>
csdn：
</br>
https://blog.csdn.net/u010308894/article/details/82689023

简介
-----
android平台下 视频转ascii码视频、图片转ascii码图片、图片转低多边形风格图片、图片emoji-masaic化
（未来功能，图片转彩色ascii码图片、图片添加新海诚风格滤镜、图片人工智能风格迁移世界名画、人脸替换融合）

[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)
[![Badge](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu/#/zh_CN)

技术概要
-----
- 像素彩色转灰度
- 二元一次方程求像素最佳解
- ndk sobel特征提取
- delaunay三角形匹配
- 泊松分布随机采样,4叉数优化
- ffmpeg图片合成视频
- 柏林噪声生成背景

功能
----
ascii
- 图片转ascii码图片(彩色or黑白)
- 视频转ascii码视频或gif(彩色or黑白)

低多边形化
- 图片转低多边形

emoji-mosaic
- emoji表情替换图片像素

滤镜
- 底片效果
- 熔铸效果
- 冰冻效果
- 连环画效果
- 褐色效果（怀旧效果）
- 瓷砖滤镜
- 同心圆效果（待优化）
- 幻影坦克（module未集成到主app）

ascii码效果图
-----
<img src="http://r.photo.store.qq.com/psb?/V12fRHz609Gs9p/q5C6h7875xoHJRqpP7TIiceenrqxH3pTAw0Yds2lsaQ!/r/dIQAAAAAAAAA" width=200 height=340/>&nbsp;&nbsp;
<img src="http://r.photo.store.qq.com/psb?/V12fRHz609Gs9p/oYrlJbY31zmfYac3qA2gaVWfy0Q.JbKNun7cEYgEbx4!/r/dFQBAAAAAAAA" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="http://r.photo.store.qq.com/psb?/V12fRHz609Gs9p/vkiKONmFj*OPiiCJkOvcx14N0ALyF.gzgMw4MoW8scY!/r/dEEBAAAAAAAA" width=200 height=340/>

低多边形效果图
-----
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly1.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly2.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly3.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly4.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly5.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly6.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly7.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly8.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly9.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/lowpoly10.png" width=200 height=340/>

emoji-masic效果图
-----
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji1.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji2.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji3.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji4.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji5.png" width=200 height=340/>&nbsp;&nbsp;&nbsp;
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/emoji6.png" width=200 height=340/>

ascii码视频
-----
<img src="https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/fzk.gif" width=300 height=500/>


# 🎓 License/许可

[Anti-996 License](LICENSE)


 - The purpose of this license is to prevent anti-labour-law companies from using the software or codes under the license, and force those companies to weigh their way of working
 - See a [full list of projects](awesomelist/projects.md) under Anti-996 License
 - It is an idea of @xushunke: [Design A Software License Of Labor Protection -- Anti 996 License](https://github.com/996icu/996.ICU/pull/15642)
 - This version of Anti-996 License is drafted by [Katt Gu, J.D, University of Illinois, College of Law](https://scholar.google.com.sg/citations?user=PTcpQwcAAAAJ&hl=en&oi=ao); advised by [Suji Yan](https://www.linkedin.com/in/tedkoyan/), CEO of [Dimension](https://www.dimension.im).  
 - This draft is adapted from the MIT license. For more detailed explanation, please see [Wiki](https://github.com/kattgu7/996-License-Draft/wiki). This license is designed to be compatible with all major open source licenses.  
 - For law professionals or anyone who is willing to contribute to future version directly, please go to [Anti-996-License-1.0](https://github.com/kattgu7/996-License-Draft). Thank you.

http://b304.photo.store.qq.com/psb?/V12fRHz62OxZA5/i8nARdFo4IAx6TO1WeAujQezz6w*dG3dER7GSWMX1YQ!/b/dDABAAAAAAAA&bo=eQLoAwAAAAADF6I!&rf=viewer_4&t=5
https://github.com/GodFengShen/PicOrVideoToAscii/blob/master/pic/ascii1.jpg

