  // pages/consume_check/consume_check.js
Page({

  data: {
    bills: [],
    filters: ['全部内容','线上购物', '线下消费'],
    types: ['全部消费','餐饮美食', '服饰美容', '生活日用','交通出行','休闲娱乐','公益慈善'],
    filter: '全部内容',
    type: '全部消费',
    filterColor: '#909090',
    typeColor: '#909090',
    date: '',
    datePickerValue: ['', '', ''],
    datePickerIsShow: false,

    name: '',
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
      name: '华为mate10手机壳',
      type: '生活日用',
      date: '2019-09-10 20:49',
      cost: '-21.80',
      info: ''
    }, {
      id: 2,
      url: '../../images/tab/list.png',
      name: '双桥路店',
      type: '餐饮美食',
      date: '2019-09-10 20:06',
      cost: '-6.00',
      info: ''
    }, {
      id: 3,
      url: '../../images/tab/list.png',
      name: '驿站寄件支付',
      type: '生活日用',
      date: '2019-09-09 9:00',
      cost: '-8.00',
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
  },

  // inputSearch: function (e) {
  //   this.setData({
  //     name: e.detail.value,
  //   })
  // },

  // search: function () {
  //   if (this.data.name.length < 1) {
  //     wx.showToast({
  //       title: '请输入内容！',
  //     })
  //   } else {
  //     //搜索，修改bills
  //   }
  // }
})