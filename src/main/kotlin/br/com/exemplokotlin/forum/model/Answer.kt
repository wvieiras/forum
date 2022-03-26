package br.com.exemplokotlin.forum.model

import java.time.LocalDateTime

data class Answer(
    val id: Long? = null,
    val message: String,
    val dateCreated: LocalDateTime = LocalDateTime.now(),
    val author: User,
    val topic: Topic,
    val answer: Boolean
)
