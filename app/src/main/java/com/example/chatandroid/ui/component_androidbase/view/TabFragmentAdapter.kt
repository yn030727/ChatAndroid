package com.example.chatandroid.ui.component_androidbase.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabFragmentAdapter(fm: FragmentManager ,var datas: List<Fragment> , var titles: List<String>) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return datas.size
    }

    override fun getItem(position: Int): Fragment {
        return datas[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}