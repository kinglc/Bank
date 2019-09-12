//app.js
App({
  onLaunch: function () {
    wx.cloud.init({
      env:'yunyi-5mvvz'
    })
  },
  globalData: {
    userInfo: null
  }
})