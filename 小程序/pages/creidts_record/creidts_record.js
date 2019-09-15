// pages/creidts_record/creidts_record.js

Page({

  data: {
    bills: [],
    types: ['全部记录','借款', '还款'],
    type: '全部记录',
    typeColor: '#909090',

    name: '',
  },

  onLoad: function (options) {
    this.getBills();
  },

  getBills: function () {
    var tmp = [{
      id: 1,
      url: '../../images/tab/list.png',
      type: '借款',
      date: '2019-09-10 20:49',
      cost: '50.00',
      info: ''
    }, {
        id: 2,
        url: '../../images/tab/list.png',
        type: '还款',
        date: '2019-09-11 20:49',
        cost: '100.00',
        info: ''
      }, {
        id: 3,
        url: '../../images/tab/list.png',
        type: '借款',
        date: '2019-09-14 20:49',
        cost: '20.00',
        info: ''
      }];
    this.setData({
      bills: tmp,
    });
    console.log(this.data.bills);
  },

  changeFilter: function (e) {
    this.setData({
      filter: this.data.filters[e.detail.value],
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
  }
})