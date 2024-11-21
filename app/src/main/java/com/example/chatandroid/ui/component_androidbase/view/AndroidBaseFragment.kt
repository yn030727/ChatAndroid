package com.example.chatandroid.ui.component_androidbase.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.chatandroid.R
import com.google.android.material.tabs.TabLayout

class AndroidBaseFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {
    lateinit var viewpager: ViewPager
    lateinit var tabs: TabLayout
    lateinit var datas: MutableList<Fragment>
    lateinit var titles: MutableList<String>
    lateinit var fadapter: TabFragmentAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_androidbase , container , false)
        //1.UI控件的的初始化
        viewpager = view.findViewById(R.id.android_base_pager)
        tabs = view.findViewById(R.id.android_base_tabs)
        val motionLayout = view.findViewById<MotionLayout>(R.id.android_base_motionLayout)


        //2.Viewpager的设置
        datas = mutableListOf(TabFragmentBase() , TabFragmentView() , TabFragmentThird())
        titles = mutableListOf("Android基础" , "AndroidView" , "Android第三方库")
        fadapter = TabFragmentAdapter(requireFragmentManager() , datas , titles)
        viewpager.adapter = fadapter
        tabs.setupWithViewPager(viewpager)
        if(motionLayout != null){
            viewpager.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
        }


        return view
    }

}