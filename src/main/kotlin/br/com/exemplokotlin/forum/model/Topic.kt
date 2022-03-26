package br.com.exemplokotlin.forum.model

import java.time.LocalDateTime

data class Topic(

    val id: Long? = null,
    val title: String,
    val message: String,
    val dateCreate: LocalDateTime = LocalDateTime.now(),
    val course: Course,
    val author: User,
    val status: StatusTopic = StatusTopic.NOT_ANSWERED,
    val answers: List<Answer> = ArrayList()

)

enum class StatusTopic {
    NOT_ANSWERED,
    NOT_SOLVED,
    SOLVED,
    CLOSED
}