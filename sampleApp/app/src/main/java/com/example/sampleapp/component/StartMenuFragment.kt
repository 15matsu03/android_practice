package com.example.sampleapp.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sampleapp.R
import kotlinx.android.synthetic.main.fragment_start_menu.*


/**
 * アプリ起動時のメニュー選択画面。
 *
 */
class StartMenuFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        button_all_list.setOnClickListener { navigate(R.layout.fragment_list) }
        button_search.setOnClickListener { navigate(R.layout.fragment_search) }
        return inflater.inflate(R.layout.fragment_start_menu, container, false)
    }

    private fun navigate(resId: Int) {
        findNavController().navigate(resId)
    }


}
