package com.example.sampleapp.Data

class BookListEntity {

    private val entityList: List<BookEntity>

    // 初期処理
    init {
        // TODO:Roomから取得できるようにする
        val sampleList = listOf (
            BookEntity("test1","author1","sample","2020/04/01"),
            BookEntity("test2","author1","sample","2020/02/01"),
            BookEntity("test3","author1","dirty", "2016/10/25")
            )
        entityList = sampleList
    }

    fun getSize() = entityList.size

    fun getEntityList() = entityList

}