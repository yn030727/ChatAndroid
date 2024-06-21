package com.example.chatandroid.logic.network

import android.util.Log
import com.example.chatandroid.logic.model.AndroidBaseModel
import com.example.chatandroid.logic.model.AndroidBaseResponse
import com.example.chatandroid.logic.model.AndroidDatabase
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors

class NetworkRunnable(val name: String , val token: String , val androidDatabase: AndroidDatabase) : Runnable {
    val TAG = "Ning_NetworkRunnable"
    val cachedThreadPoll = Executors.newCachedThreadPool()

    override fun run() {
        Log.d(TAG, "networkRunnable begin" )

        //1.为自己的网络请求拦截器配置属性
        AndroidBaseService2.interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        //2.保存返回结果的result
        var result = String()

        //3.发起网络请求，获取数据
        var mediaType2 = MediaType.parse("application/json")
        var requestBody = RequestBody.create(mediaType2 , "{\"messages\":[{\"role\":\"user\",\"content\":\"$name\"}]}")
        try {
            var access_token = token
            //创建Retrofit构建器
            var retrofit = Retrofit.Builder()
                .baseUrl("https://aip.baidubce.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(AndroidBaseService2.HTTP_CLIENT)
                .build()
            //创建接口实例
            var request = retrofit.create(AndroidBaseRequestInterface::class.java)
            //封装请求
            var call = request.getCall(requestBody , AndroidBaseService2.staticGetAccessToken())
            //发送网络请求
            call.enqueue(object: Callback<AndroidBaseResponse> {
                override fun onResponse(
                    call: Call<AndroidBaseResponse>,
                    response: Response<AndroidBaseResponse>
                ) {
                    result = response.body()?.result.toString()
                    cachedThreadPoll.execute(Thread{
                        androidDatabase.androidBaseModelDao().insertAndroidBase(AndroidBaseModel(name , result))
                    })
//                    val thread = Thread{
//                        androidDatabase.androidBaseModelDao().insertAndroidBase(AndroidBaseModel(name , result))
//                    }.start()
                    println(response.body()?.result)
                }

                override fun onFailure(call: Call<AndroidBaseResponse>, t: Throwable) {
                    t.printStackTrace()
                    println("连接失败")
                }

            })
        }catch (e: Exception){
            e.printStackTrace()
        }
    }
}