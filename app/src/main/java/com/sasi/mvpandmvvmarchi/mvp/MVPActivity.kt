package com.sasi.mvpandmvvmarchi.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sasi.mvpandmvvmarchi.R
import com.sasi.mvpandmvvmarchi.mvp.presenter.LoginPresenter
import com.sasi.mvpandmvvmarchi.mvp.view.ILoginView
import kotlinx.android.synthetic.main.activity_mvp.*

class MVPActivity : AppCompatActivity(), ILoginView {
    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    var loginPresenter: LoginPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
        loginPresenter = LoginPresenter(this)
        btn_login.setOnClickListener {
            loginPresenter?.onLogin("", "")
        }

    }

}
