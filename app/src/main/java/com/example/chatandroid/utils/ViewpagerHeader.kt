package com.example.chatandroid.utils

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager

class ViewpagerHeader @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null , defStyleAttr: Int = 0
) : MotionLayout(context, attrs , defStyleAttr)  , ViewPager.OnPageChangeListener{
    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        val numPages = 3
        progress = (position + positionOffset) / (numPages - 1)
        Log.d("Ning_ViewPager", "onPageScrolled: " + progress)
    }

    override fun onPageSelected(position: Int) {
    }

    override fun onPageScrollStateChanged(state: Int) {
    }

}