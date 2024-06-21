package com.example.chatandroid.ui.individual

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chatandroid.R

class IndividualFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_individual , container , false)
        return view
    }
}