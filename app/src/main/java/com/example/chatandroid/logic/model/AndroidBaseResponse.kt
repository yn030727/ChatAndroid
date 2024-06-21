package com.example.chatandroid.logic.model

import kotlin.properties.Delegates

data class AndroidBaseResponse (
    val id: String ,
    val `object`: String,
    val created: Long,
    val result: String,
    val need_clear_history: Boolean,
    val usage: Usage
){
    data class Usage(
        val prompt_tokens: Int,
        val completion_tokens: Int,
        val total_tokens: Int
    )
}