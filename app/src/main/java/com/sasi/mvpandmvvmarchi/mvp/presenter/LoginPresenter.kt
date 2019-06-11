package com.sasi.mvpandmvvmarchi.mvp.presenter

import com.sasi.mvpandmvvmarchi.mvp.model.User
import com.sasi.mvpandmvvmarchi.mvp.view.ILoginView

class LoginPresenter(var iLoginView: ILoginView) : ILoginPresenter {

    override fun onLogin(username: String, userPwd: String) {
        var user = User()
        user.userName = "sasi"
        user.password = "sasi"
        if (user.isValidData()) {
            iLoginView.onLoginResult("Successfully Added")
        } else {
            iLoginView.onLoginResult("Data validation error")
        }
    }

}