package com.example.sampleapp.Data

/**
 * 各書籍の情報を保持するEntity。
 */
class BookEntity(title: String, author: String, publisher: String, publicationDate: String) {
    val bookTitle: String = title
    val bookAuthor: String = author
    val bookPublisher: String = publisher
    val bookPublicationDate: String? = publicationDate
}