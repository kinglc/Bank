// pages/credits_exchange/credits_exchange.js

Page({

  data: {
    bills: [],
    types: ['全部消费','充值', '提现'],
    type: '全部消费',
    typeColor: '#909090',

    name: '',

    date: '',
    datePickerValue: ['', '', ''],
    datePickerIsShow: false
  },
  showDatePicker: function (e) {
    // this.data.datePicker.show(this);
    this.setData({
      datePickerIsShow: true,
    });
  },

  datePickerOnSureClick: function (e) {
    console.log('datePickerOnSureClick');
    console.log(e);
    this.setData({
      date: `${e.detail.value[0]}年${e.detail.value[1]}月${e.detail.value[2]}日`,
      datePickerValue: e.detail.value,
      datePickerIsShow: false,
    });
  },

  datePickerOnCancelClick: function (event) {
    console.log('datePickerOnCancelClick');
    console.log(event);
    this.setData({
      datePickerIsShow: false,
    });
  },
  onLoad: function (options) {
    this.getBills();
  },

  getBills: function () {
    var tmp = [{
      id: 1,
      url: '../../images/tab/list.png',
      type: '充值',
      date: '2019-09-10 20:49',
      cost: '+50.00',
      info: ''
    }, {
      id: 2,
      url: '../../images/tab/list.png',
      type: '提现',
      date: '2019-09-11 20:49',
      cost: '-100.00',
      info: ''
    }, {
      id: 3,
      url: '../../images/tab/list.png',
      type: '充值',
      date: '2019-09-14 20:49',
      cost: '+20.00',
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