// pages/shop/shop.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    bills: [],
    filters: ['全部内容','网购', '线下消费', '理财', '转账', '提现', '红包', '还款', '缴费', '手机充值', '有退款'],
    types: ['全部内容','全部消费','餐饮美食', '服饰美容', '生活日用', '日常缴费', '交通出行', '通讯物流', '休闲娱乐', '医疗保健', '住房物业', '文体教育', '投资理财', '金融保险', '信用借还', '人情往来', '公益慈善', '经营所得', '职业酬劳', '奖金红包', '转账充值'], 
    filter:'全部内容',
    type:'全部内容',
    filterColor:'#909090',
    typeColor:'#909090',

    name:'',
  }, 


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getBills();
  },

  getBills: function () {
    var tmp=[{
      id: 1,
      url: '../../images/shop_order/pj.png',
      name: '余额宝-收益发放',
      type: '投资理财',
      date: '今天 04：34',
      cost: '+0.11',
      info: '',
    },{
      id: 2,
      url: '../../images/shop_order/pj.png',
      name: '余额宝-收益发放',
      type: '投资理财',
      date: '昨天 03:13',
        cost: '+0.11',
      info: '',
    },{
      id: 3,
      url: '../../images/shop_order/pj.png',
      name: '华为mate10手机壳ALP-',
      type: '生活日用',
      date: '09-10 20:49',
        cost: '-21.80',
      info: '等待确认收货',
    },{
      id: 4,
      url: '../../images/shop_order/pj.png',
      name: '双桥路店',
      type: '餐饮美食',
      date: '09-10 20:06',
      cost: '-6.00',
      info: '',
    },{
      id: 5,
      url: '../../images/shop_order/pj.png',
      name: '驿站寄件支付',
      type: '快递',
      date: '09-09 9:00',
      cost: '-8.00',
      info: '',
    }];
    this.setData({
      bills:tmp,
    });
    console.log(this.data.bills);
  },

  changeFilter:function(e){
      this.setData({
        filter:this.data.filters[e.detail.value],
      });
      if (e.detail.value === 0) {
        this.setData({
         filterColor: '#909090',
        });
      } else {
        this.setData({
          filterColor: '#967F51',
        });
      }
  },

  changeType: function (e) {
    this.setData({
      type: this.data.types[e.detail.value],
    });
    if (e.detail.value === 0) {
      this.setData({
        typeColor: '#909090',
      });
    } else {
      this.setData({
        typeColor: '#967F51',
      });
    }
  },

  inputSearch:function(e){
    this.setData({
      name:e.detail.value,
    })
  },

  search:function(){
    if (this.data.name.length < 1) {
      wx.showToast({
        title: '请输入内容！',
      })
    } else {
      //搜索，修改bills
    }
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})