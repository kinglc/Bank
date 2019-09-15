// pages/home/home.js
var app = getApp();

Page({
  
    data: {
        // 广告轮播
        imgUrls: [
            "../../images/advers/adver-1.jpg",
            "../../images/advers/adver-2.jpg",
            "../../images/advers/adver-3.jpg",
            "../../images/advers/adver-4.jpg"
        ],
        indicatorDots: true,
        autoplay: true,
        interval: 3000,
        duration: 1000,
    }
})