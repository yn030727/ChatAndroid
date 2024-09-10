package com.example.chatandroid.logic.model.debug

import java.util.Vector

class NingInnerClass(val nums:Int) {
    //内部类
    inner class ClassA{
        fun printA(){
            print("1)")
        }
    }
    //内部类(实例化不需要外部类的实例)
    class ClassB{
        fun printB(){
            print("2")
        }
    }
    //静态内部类
    companion object{
        fun printC(){
            print("3)")
        }
    }
    //匿名内部类
    object classC : NingInnerInterface {
        override fun printNum() {
            TODO("Not yet implemented")
        }

    }
    fun bar() = object {
        val x: String = "123"
    }

    fun testVectorThreadSafe(a:Int): Void{
        val vec : Vector<Int> = Vector(10)
        vec.apply {
            add(1)
            add(2)
            add(3)
        }
        while(true){
            Thread(Runnable {
                if (vec.size > 0){
                    print(vec.get(0))
                }
            }).start()

            Thread(Runnable {
                vec.clear()
            })
        }
    }
}