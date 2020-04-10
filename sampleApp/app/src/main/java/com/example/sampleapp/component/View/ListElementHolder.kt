package com.example.sampleapp.component.View

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ListElementHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val bookTitle = itemView.book_title
    val bookAuthor = itemView.book_author
    val bookPublisher = itemView.publisher
    val bookPublicationDate = itemView.publication_date
}