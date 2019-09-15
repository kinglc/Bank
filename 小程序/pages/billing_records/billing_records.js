// pages/billing_records/billing_records.js
Page({
  data: {
    imgUrl:""
  },
  //图片上传
  upload_picture:function(){ 
    let that=this;
    let timestamp=Date.parse(new Date())
    console.log("时间戳", timestamp)
    console.log("点击了图片上传")
    //用户选择图片上传
    wx.chooseImage({
      count:1,
      success: chooseResult=>{
        //上传进度
        wx.showLoading({
          title: '上传中...',
        })
        //图片上传至云存储空间
        wx.cloud.uploadFile({
          //指定上传到的云路径
          cloudPath: timestamp+".png",
          filePath: chooseResult.tempFilePaths[0],
          //成功回调
          success: res => {
            wx.hideLoading()
            console.log("上传成功",res)
            //setData对数据页面进行赋值，此处赋值fileID
            that.setData({
              imgUrl: res.fileID
            })
            that.addImgList(res.fileID)
          }
        })
      },
    })
  },
  //添加图片到图片列表
  addImgList:function(imgUrl){
    let that=this;
    wx.cloud.database().collection("imagelist").add({
      data:{
        // name:"name",
        imgUrl:imgUrl,
        time:that.getNowFormatDate()
      },
      success(res){
        console.log("上传成功",res)
      },
      fail(res){
        console.log("上传失败",res)
      }
    })
  },
  //获取当前时间,返回时间格式：XXXX-XX-XX HH:MM:SS
  getNowFormatDate: function () {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
      month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
      strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate +
      " " + date.getHours() + seperator2 + date.getMinutes() +
      seperator2 + date.getSeconds();
    return currentdate;
  }
})