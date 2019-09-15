//app.js
App({
  
  onLaunch: function () {
    //云开发环境的初始化
    wx.cloud.init({
      env:'yunyi-5mvvz'
    })
  },

  globalData: {
    userInfo: null
  },

  //获取用户openID
  getopenid:function(){
    wx.cloud.callFunction({
      name: "getopenid",
      success(res){
        console.log("获取openid成功",res.result.openid)
      },
      fail(res){
        console.log("获取openid失败",res)
      }
    })
  }
})