package com.example.chatandroid.ui.component_base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(val nums:Int?, var number:Int) : ViewModel() {
    constructor(nums: Int) : this(nums, 0) {
        println("nums: $nums , number: 0")
    }
    init {
        //nums = 1
        number = 1
        println("nums: $nums, number: $number")
    }


    var testLiveData: MutableLiveData<Int>? = null

    fun setTestLiveData(num: Int): MutableLiveData<Int> { //非空断言工具
        if(testLiveData == null){
            testLiveData = MutableLiveData()
            testLiveData!!.value = num
        }
        return testLiveData!!
    }
}