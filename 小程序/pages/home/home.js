// pages/home/home.js
var app = getApp();

Page({
    /**
     * 页面的初始数据
     */
    data: {
        // advertising
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

        tempFilePaths: '',
        dataList:[]
    },

    chooseimage: function() {
      var that=this;
      var timestamp=Date.parse(new Date());
      console.log("当前的时间戳",timestamp)
      console.log("点击了图片上传")
      // 让用户选择一张图片
      wx.chooseImage({
        count:9,
        success: chooseResult => {
          wx.showLoading({
            title: '上传中...',
          })
          //遍历数组
          chooseResult.tempFilePaths.forEach((item,index)=>{
            // 将图片上传至云存储空间
            wx.cloud.uploadFile({
              // 指定上传到的云路径
              cloudPath: timestamp+'.png',
              // 指定要上传的文件的小程序临时文件路径
              filePath: chooseResult.tempFilePaths[0],
              // 成功回调
              success: res => {
                wx.hideLoading()
                console.log('上传成功', res)
                that.addImageList(res.fileID)
              },
            })
          })
        },
      })
    },
    //添加到图片列表
    addImageList:function(imgUrl){
      wx.cloud.database().collection('imagelist').add({
        data:{
            name:"test",
            imgUrl:imgUrl
        },
        success: function (res) {
          console.log("添加成功",res)
        },
        fail:function(res){
          console.log("添加失败",res)
        }
      })
    },
    //显示图片
    onShow:function(){
      this.getImageList();
    },
    //读取云中的图片
    getImageList: function (imgUrl) {
      var that=this;
      wx.cloud.database().collection('imagelist').get({
        success: function (res) {
          console.log("读取成功", res)
          that.setData({
            dataList:res.data
          })
        },
        fail: function (res) {
          console.log("读取失败", res)
        }
      })
  }

})