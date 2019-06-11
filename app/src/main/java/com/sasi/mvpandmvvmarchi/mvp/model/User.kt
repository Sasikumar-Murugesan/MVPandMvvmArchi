package com.sasi.mvpandmvvmarchi.mvp.model

class User : IUser {


    override fun isValidData(): Boolean {
        if (this.userName.isNullOrEmpty() || this.password.isNullOrEmpty()) {
            return false
        }
        return true
    }

    var userName: String? = null
    var password: String? = null


    override fun getUserPassword(): String {
        return this.password ?: ""
    }

    override fun getUsername(): String {
        return this.userName ?: ""
    }


}