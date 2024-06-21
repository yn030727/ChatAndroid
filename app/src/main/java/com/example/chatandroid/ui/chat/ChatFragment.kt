package com.example.chatandroid.ui.chat

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chatandroid.R

class ChatFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {
    val TAG: String = "Ning_ChatFragment"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_chat , container , false)
        Log.d(TAG, "onCreateView")
        return view
    }


}