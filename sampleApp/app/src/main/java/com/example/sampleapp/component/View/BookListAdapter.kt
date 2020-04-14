package com.example.sampleapp.component.View

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleapp.Data.BookListEntity
import com.example.sampleapp.R
import com.example.sampleapp.action.navigate

/**
 * 一覧表示で使用するRecyclerViewとデータを結ぶためのAdapter。
 */
// FIXME: DataBindingするような構成に修正すること
class BookListAdapter(private val dataSet: BookListEntity, private val context: Context, private val fragment: Fragment) :
    RecyclerView.Adapter<ListElementHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListElementHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ListElementHolder(layout)
    }

    override fun onBindViewHolder(holder: ListElementHolder, position: Int) {
        val element = dataSet.getEntityList()[position]
        holder.buttonDetail.text = context.getString(R.string.button_text_detail)
        holder.bookTitle.text = element.bookTitle
        holder.bookAuthor.text = element.bookAuthor
        holder.bookPublisher.text = element.bookPublisher
        holder.bookPublicationDate.text = element.bookPublicationDate

        // 詳細画面への遷移
        holder.buttonDetail.setOnClickListener {
            // TODO: 画面に渡すパラメータの実装を行うこと
            navigate(fragment, R.id.action_listFragment_to_detailFragment)
        }
    }

    override fun getItemCount(): Int = dataSet.getSize()
}