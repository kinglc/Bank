// pages/billing_list/billing_list.js

Page({
  data: {
    imgUrl: "",
    dataList:[],
    date: '',
    datePickerValue: ['', '', ''],
    datePickerIsShow: false
  },

  //显示获取的图片
  onShow:function(){
    this.getImgList();
  },

  //获取图片信息
  getImgList:function(){
    let that=this;
    wx.cloud.database().collection("imagelist").get({
      success(res) {
        console.log("获取成功", res)
        that.setData({
          dataList:res.data
        })
      }
    })
    this.getopenid();
  },

  //发布账单内容
  publish_record:function(){
    wx.navigateTo({
      url:"../billing_records/billing_records"
    })
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
})
