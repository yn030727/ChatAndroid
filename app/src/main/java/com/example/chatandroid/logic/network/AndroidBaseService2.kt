package com.example.chatandroid.logic.network

import android.app.Service
import android.content.Intent
import android.content.SharedPreferences.Editor
import android.os.IBinder
import android.util.Log
import com.example.chatandroid.logic.model.AndroidBaseModel
import com.example.chatandroid.logic.model.AndroidBaseResponse
import com.example.chatandroid.logic.model.AndroidDatabase
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.math.log

class AndroidBaseService2 : Service() {
    val TAG = "Ning_AndroidBaseService"
    var length: Int = 0
    lateinit var androidBaseModelNameList: ArrayList<String>    //所有知识点名称的集合
    lateinit var androidBaseDataList: List<AndroidBaseModel>    //数据库中返回的数据的集合
    lateinit var androidDatabase: AndroidDatabase               //数据库
    lateinit var androidBaseDataNameList: MutableList<String>   //数据库中返回的数据的名称的集合
    var token: String = ""


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    //方法1：服务创建的方法，里面初始化数据库
    override fun onCreate() {
        Log.d(TAG, "onCreate")
        super.onCreate()
        //1.初始化数据库
        androidDatabase = AndroidDatabase.getInstance(this)
        androidBaseDataNameList = ArrayList<String>()

        //2.初始化安卓知识集合
        androidBaseModelNameList = arrayListOf(
            "简单介绍下Android的Activity的概念和基础使用" ,
            "简单介绍下Android的Service的概念和基础使用" ,
            "简单介绍下Android的Broadcast的概念和基础使用" ,
            "简单介绍下Android的ContentProvider的概念和基础使用" ,
            "简单介绍下Android的Intent的概念和基础使用" ,
            "简单介绍下Android的Handler的概念和基础使用" ,
            "简单介绍下Android的SharedPreference的概念和基础使用" ,
            "简单介绍下Android的Fragment的概念和基础使用" ,
            "简单介绍下Android的ListView的概念和基础使用" ,
            "简单介绍下Android的RecyclerView的概念和基础使用" ,
            "简单介绍下Android的ViewPager的概念和基础使用" ,
            "简单介绍下Android的自定义View的概念和基础使用" ,
            "简单介绍下Android的Bitmap的概念和基础使用" ,
            "简单介绍下Android的OkHttp的概念和基础使用" ,
            "简单介绍下Android的ViewModel的概念和基础使用" ,
            "简单介绍下Android的Retrofit的概念和基础使用" ,
        )
    }

    //方法2：在子线程中运行，在里面可以处理一些耗时操作
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand")

        //网络请求前的准备工作
        val readyRunnable = object : Runnable{
            override fun run() {
                Log.d(TAG, "readyRunnable begin")

                //1.获取Room数据库中数据(数据和数据的名称)和数据的个数
                androidBaseDataList = androidDatabase.androidBaseModelDao().getModelList()
                length = androidBaseDataList.size
                for(i in 0 until length){
                    androidBaseDataNameList.add(androidBaseDataList.get(i).name)
                }
                Log.d(TAG, "AndroidBaseData Has Already finish " + length)

                //2.获取访问的AccessToken
                token = staticGetAccessToken()

                //3.具体的网络请求过程
                //网络请求的循环次数为：androidBaseModelNameList.size() - length
                for(i in 0 until  androidBaseModelNameList.size ){
                    //查看返回的数据的名字集合当中不存在的元素
                    //对这些不存在的元素进行网络请求访问？
                    var content = androidBaseModelNameList.get(i)
                    if(!androidBaseDataNameList.contains(content)){
                        Log.d(TAG, "getModelName" + content)
                        val networkThread = Thread(NetworkRunnable(content , token , androidDatabase))
                        networkThread.start()
//                        val cachedThreadPoll = Executors.newCachedThreadPool()
//                        cachedThreadPoll.execute(Thread(NetworkRunnable(content , token , androidDatabase)))
                    }
                }
                stopSelf()
            }
        }

        //开启线程执行服务的请求
        val readyThread = Thread(readyRunnable).start() //执行完后，可以获取数据库中的元素的个数length
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    //伴生类——静态对象和方法
    companion object{
        //静态变量
        val API_KEY: String = "5GHSlGSkqlDiGA57zWmilkwp"
        var SECRET_KEY: String = "UAbadAXq7Evl1qbg9j9aWGcXibZ8oNH8"
        var interceptor = HttpLoggingInterceptor(){
            Log.i("Ning" , it)
        }
        var HTTP_CLIENT: OkHttpClient = OkHttpClient()
            .newBuilder()
            .connectTimeout(60000 , TimeUnit.MILLISECONDS)
            .readTimeout(60000 , TimeUnit.MILLISECONDS)
            .addInterceptor(interceptor)
            .build()

        //静态方法1：获取AccessToken
        fun staticGetAccessToken(): String{
            var mediaType = MediaType.parse("application/x-www-form-urlencoded")
            var requestBody = RequestBody.create(mediaType , "grant_type=client_credentials&client_id=" + API_KEY + "&client_secret=" + SECRET_KEY)
            var request = Request.Builder()
                .url("https://aip.baidubce.com/oauth/2.0/token")
                .method("POST" , requestBody)
                .addHeader("Content-type" , "application/x-www-form-urlencoded")
                .build()
            var response = HTTP_CLIENT.newCall(request).execute()
            return JSONObject(response.body()!!.string()).getString("access_token")
        }
    }
}