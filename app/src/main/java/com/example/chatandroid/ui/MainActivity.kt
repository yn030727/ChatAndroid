package com.example.chatandroid.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView
import com.example.chatandroid.R
import com.example.chatandroid.logic.network.AndroidBaseService2
import com.example.chatandroid.ui.androidbase.AndroidBaseFragment
import com.example.chatandroid.ui.chat.ChatFragment
import com.example.chatandroid.ui.community.CommunityFragment
import com.example.chatandroid.ui.individual.IndividualFragment


//View界面(只负责UI的展示)
//1. 初始化UI
//2. 这只点击底部导航栏的动画切换效果(具体方法：initButtonAnimation)


class MainActivity : AppCompatActivity() {
    //全局变量——控件
    lateinit var typefaceEnglish: Typeface
    lateinit var typefaceWord: Typeface
    lateinit var navigationChatBtn: LottieAnimationView
    lateinit var navigationAndroidBtn: LottieAnimationView
    lateinit var navigationCommunityBtn: LottieAnimationView
    lateinit var navigationPersonBtn: LottieAnimationView
    lateinit var navigationChatText: TextView
    lateinit var navigationAndroidText: TextView
    lateinit var navigationCommunityText: TextView
    lateinit var navigationPersonText: TextView
    lateinit var chatFragment: Fragment
    lateinit var androidFragment: Fragment
    lateinit var communityFragment: Fragment
    lateinit var individualFragment: Fragment
    val TAG: String = "Ning_MainActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //设置字体
        typefaceWord = Typeface.createFromAsset(assets , "fonts/font_splash.ttf")
        typefaceEnglish = Typeface.createFromAsset(assets , "fonts/font_english.ttf")
        //设置全屏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //UI初始化
        navigationChatBtn = findViewById(R.id.navigation_chat_btn)
        navigationAndroidBtn = findViewById(R.id.navigation_android_btn)
        navigationCommunityBtn = findViewById(R.id.navigation_community_btn)
        navigationPersonBtn = findViewById(R.id.navigation_person_btn)
        navigationChatText = findViewById(R.id.navigation_chat_text)
        navigationAndroidText = findViewById(R.id.navigation_android_text)
        navigationCommunityText = findViewById(R.id.navigation_community_text)
        navigationPersonText = findViewById(R.id.navigation_person_text)
        navigationChatText.typeface = typefaceWord
        navigationAndroidText.typeface = typefaceWord
        navigationCommunityText.typeface = typefaceWord
        navigationPersonText.typeface = typefaceWord
        chatFragment = ChatFragment(R.layout.fragment_chat)
        androidFragment = AndroidBaseFragment(R.layout.fragment_androidbase)
        communityFragment = CommunityFragment(R.layout.fragment_community)
        individualFragment = IndividualFragment(R.layout.fragment_individual)
        navigationChatBtn.playAnimation()   //初始化界面播放动画
        initFragment(chatFragment)  //初始化首界面
        startServiceByNetWork() //开启服务执行Android知识库的网络请求



        //1.点击事件切换Fragment
        navigationChatBtn.setOnClickListener {
            Log.d(TAG, "navigation_Chat Click!")
            initButtonAnimation(navigationChatBtn)
            navigationChatBtn.playAnimation()
            initFragment(chatFragment)
        }
        navigationAndroidBtn.setOnClickListener {
            Log.d(TAG, "navigation_Android Click!")
            initButtonAnimation(navigationAndroidBtn)
            navigationAndroidBtn.playAnimation()
            initFragment(androidFragment)
        }
        navigationCommunityBtn.setOnClickListener {
            Log.d(TAG, "navigation_Community Click!")
            initButtonAnimation(navigationCommunityBtn)
            navigationCommunityBtn.playAnimation()
            initFragment(communityFragment)
        }
        navigationPersonBtn.setOnClickListener {
            Log.d(TAG, "navigation_Person Click!")
            initButtonAnimation(navigationPersonBtn)
            navigationPersonBtn.playAnimation()
            initFragment(individualFragment)
        }

    }




    //点击底部按钮栏动画效果
    fun initButtonAnimation(lottieAnimationView: LottieAnimationView){
        if(lottieAnimationView == navigationChatBtn){
            navigationAndroidBtn.progress = 0.15f
            navigationCommunityBtn.progress = 0.15f
            navigationPersonBtn.progress = 0.15f
            navigationAndroidBtn.cancelAnimation()
            navigationCommunityBtn.cancelAnimation()
            navigationPersonBtn.cancelAnimation()
        }else if(lottieAnimationView == navigationAndroidBtn){
            navigationChatBtn.progress = 0.15f
            navigationCommunityBtn.progress = 0.15f
            navigationPersonBtn.progress = 0.15f
            navigationChatBtn.cancelAnimation()
            navigationCommunityBtn.cancelAnimation()
            navigationPersonBtn.cancelAnimation()
        }else if(lottieAnimationView == navigationCommunityBtn){
            navigationAndroidBtn.progress = 0.15f
            navigationChatBtn.progress = 0.15f
            navigationPersonBtn.progress = 0.15f
            navigationChatBtn.cancelAnimation()
            navigationAndroidBtn.cancelAnimation()
            navigationPersonBtn.cancelAnimation()
        }else if(lottieAnimationView == navigationPersonBtn){
            navigationAndroidBtn.progress = 0.15f
            navigationChatBtn.progress = 0.15f
            navigationCommunityBtn.progress = 0.15f
            navigationChatBtn.cancelAnimation()
            navigationAndroidBtn.cancelAnimation()
            navigationCommunityBtn.cancelAnimation()
        }
    }

    //切换Fragment
    fun initFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container , fragment)
        fragmentTransaction.commit()
    }
    //开启服务器执行网络请求
    fun startServiceByNetWork(){
        Log.d(TAG, "startServiceByNetWork")
        var intent = Intent(this@MainActivity , AndroidBaseService2::class.java)
        startService(intent)
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}