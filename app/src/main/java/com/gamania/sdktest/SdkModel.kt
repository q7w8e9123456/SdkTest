package com.gamania.sdktest

class SdkModel {

    private var version: Int = 0

    fun setModelValue(ver: Int) {
        version = ver
    }

    fun getModelValue():Int {
        return version
    }
}