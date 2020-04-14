package com.example.sampleapp.action

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController

/**
 * idを指定して画面遷移を行う。
 *
 * @param resId 画面遷移に使用するナビゲーションのid。
 */
fun navigate(fragment: Fragment, resId: Int) {
    findNavController(fragment).navigate(resId)
}