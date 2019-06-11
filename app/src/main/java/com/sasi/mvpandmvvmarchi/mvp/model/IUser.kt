package com.sasi.mvpandmvvmarchi.mvp.model


public interface IUser{
    fun getUsername():String
    fun getUserPassword():String
    fun isValidData():Boolean
}