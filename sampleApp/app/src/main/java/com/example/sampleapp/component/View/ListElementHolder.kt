package com.example.sampleapp.component.View

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ListElementHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val buttonDetail = itemView.button_detail
    val bookTitle: TextView = itemView.book_title
    val bookAuthor: TextView = itemView.book_author
    val bookPublisher: TextView = itemView.publisher
    val bookPublicationDate: TextView = itemView.publication_date
}