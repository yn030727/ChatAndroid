package com.example.chatandroid.logic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/chatandroid/logic/network/AndroidBaseRequestInterface;", "", "getCall", "Lretrofit2/Call;", "Lcom/example/chatandroid/logic/model/AndroidBaseResponse;", "requestBody", "Lokhttp3/RequestBody;", "accessToken", "", "app_debug"})
public abstract interface AndroidBaseRequestInterface {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.POST(value = "rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions")
    public abstract retrofit2.Call<com.example.chatandroid.logic.model.AndroidBaseResponse> getCall(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    okhttp3.RequestBody requestBody, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "access_token")
    java.lang.String accessToken);
}