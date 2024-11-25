package com.example.chatandroid.ui.component_base.view

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import com.example.chatandroid.R

class SplashActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //设置字体
        val typeface = Typeface.createFromAsset(assets , "fonts/font_splash.ttf")
        val typefaceWord = Typeface.createFromAsset(assets , "fonts/font_english.ttf")
        //界面UI字体
        val splashApplicationName: TextView = findViewById(R.id.splash_application_name)
        val splashApplicationTitle: TextView = findViewById(R.id.splash_application_title)
        splashApplicationTitle.typeface = typeface
        splashApplicationName.typeface = typefaceWord


        //设置全屏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //发送消息延迟函数
        handler.sendEmptyMessageDelayed(0 , 2000)
    }

    private val handler = object : Handler(Looper.myLooper()!!){
        override fun handleMessage(msg: Message) {
            var intent = Intent(this@SplashActivity , MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        val textView1 = this.findViewById<TextView>(R.id.splash_application_name)
//        outState.putInt("splash_textView_id", textView1.id)
//    }
    fun testForGit(value: Int) {
        Log.d("develop/test1.0", "git for cherry-pick")
    }
}