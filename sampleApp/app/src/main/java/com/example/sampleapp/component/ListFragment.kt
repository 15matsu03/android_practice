package com.example.sampleapp.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.Data.BookListEntity
import com.example.sampleapp.R
import com.example.sampleapp.component.View.BookListAdapter
import kotlinx.android.synthetic.main.fragment_list.view.*

/**
 * 一覧表示画面。検索結果の表示にも使用する。
 * 一覧として表示するのは、書名・筆者名・出版社・出版日。
 */
class ListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: BookListAdapter
    private lateinit var viewManager: LinearLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerView = view.book_list
        viewManager = LinearLayoutManager(context)
        recyclerView.layoutManager = viewManager

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewAdapter = BookListAdapter(BookListEntity(), requireContext(), this)
        recyclerView.adapter = viewAdapter
    }
}