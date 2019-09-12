const app = getApp()

Page({
    data: {
        showModalStatus: false
    },

    formSubmit: function(e) {
        var that = this;
        var name = that.data.username;
        var phone = that.data.phone;
        var password = that.data.password;
        var enpassword = that.data.ensurePassword;
        if (utils.checkName(name)) {
            wx.showModal({
                title: "信息提示",
                content: "姓名不能含有数字"
            })
        } else if (utils.checkPhone(phone)) {
            wx.showModal({
                title: "信息提示",
                content: "手机号码错误"
            })
        } else
        if (password.length < 6) {
            wx.showModal({
                title: "信息提示",
                content: "密码至少为六位！"
            })
        } else if (password !== enpassword) {
            wx.showModal({
                title: "信息提示",
                content: "请确认密码是否相同！"
            })
        } else if (!e.detail.value.xieyi) {
            wx.showModal({
                title: "信息提示",
                content: "请勾选协议书！"
            })
        } else if (password && enpassword) {
            wx.request({
                url: app.host.url + 'userRegister',
                data: {
                    'username': e.detail.value.username,
                    'sex': e.detail.value.sex,
                    'phone': e.detail.value.phone,
                    'password': e.detail.value.password,
                },
                method: 'POST',
                header: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                },
                success: function(res) {
                    console.log(res.data)
                    var info = JSON.stringify(res.data.info)
                    var msg = JSON.stringify(res.data.code)
                    if (msg == 0) {
                        wx.showModal({
                            title: "信息提示",
                            content: "注册成功",
                            duration: 2000
                        })
                        wx.redirectTo({
                            url: '../login/login?phone_no=&user_password',
                        })
                    } else if (msg == 1) {
                        wx.showModal({
                            title: "信息提示",
                            content: "用户已存在",
                            duration: 1500
                        })
                    }
                },
                fail: function(res) {
                    wx.showToast({
                        title: '服务器网络错误,请稍后重试',
                        icon: 'loading',
                        duration: 1500
                    })
                },
            })
        }
    }, 
    goLogin: function() {
        wx.redirectTo({
            url: '../user/user',
        })
    }
})