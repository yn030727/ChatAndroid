package com.example.chatandroid.logic.network

import com.example.chatandroid.logic.model.AndroidBaseResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface AndroidBaseRequestInterface {
    @POST("rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions")
    fun getCall(@Body requestBody: RequestBody , @Query("access_token") accessToken: String):Call<AndroidBaseResponse>
}