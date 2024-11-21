package com.example.chatandroid.ui.component_base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(num:Int?, number:Int) : ViewModel() {
    constructor(num: Int) : this(num, 0) {
        println("num: $num , number: 0")
    }
    init {
        //num = 1
        //number = 1
        println("num: $num, number: $number")
    }


    var testLiveData: MutableLiveData<Int>? = null

    fun setTestLiveData(num: Int): MutableLiveData<Int> { //非空断言工具
        if(testLiveData == null){
            testLiveData = MutableLiveData()
            testLiveData!!.value = num
        }
        return testLiveData!!
    }

    fun getLiveData(): MutableLiveData<Int>? {
        if(testLiveData == null) {
            testLiveData = MutableLiveData(0)
        }
        return testLiveData
    }
}