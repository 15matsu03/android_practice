package com.example.sampleapp.component.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.Data.BookListEntity
import com.example.sampleapp.R

/**
 * 一覧表示で使用するRecyclerViewとデータを結ぶためのAdapter。
 */
// FIXME: DataBindingするような構成に修正すること
class BookListAdapter(private val dataSet: BookListEntity) : RecyclerView.Adapter<ListElementHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListElementHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListElementHolder(layout)
    }

    override fun onBindViewHolder(holder: ListElementHolder, position: Int) {
        val element = dataSet.getEntityList()[position]
        holder.bookTitle.text = element.bookTitle
        holder.bookAuthor.text = element.bookAuthor
        holder.bookPublisher.text = element.bookPublisher
        holder.bookPublicationDate.text = element.bookPublicationDate
    }

    override fun getItemCount(): Int = dataSet.getSize()
}