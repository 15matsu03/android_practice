package com.example.sampleapp.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sampleapp.R
import com.example.sampleapp.action.navigate
import kotlinx.android.synthetic.main.fragment_start_menu.*


/**
 * アプリ起動時のメニュー選択画面。
 *
 */
class StartMenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_start_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 一覧画面への遷移
        button_all_list.setOnClickListener { navigate(this, R.id.action_startMenuFragment_to_listFragment) }
        // 検索画面への遷移
        button_search.setOnClickListener { navigate(this, R.id.action_startMenuFragment_to_searchFragment) }
    }
}
