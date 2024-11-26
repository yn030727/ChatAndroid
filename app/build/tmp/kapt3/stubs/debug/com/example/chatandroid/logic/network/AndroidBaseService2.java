package com.example.chatandroid.logic.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\"\u00100\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0013j\b\u0012\u0004\u0012\u00020\u0004`\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010(\u00a8\u00064"}, d2 = {"Lcom/example/chatandroid/logic/network/AndroidBaseService2;", "Landroid/app/Service;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "androidBaseDataList", "", "Lcom/example/chatandroid/logic/model/AndroidBaseModel;", "getAndroidBaseDataList", "()Ljava/util/List;", "setAndroidBaseDataList", "(Ljava/util/List;)V", "androidBaseDataNameList", "", "getAndroidBaseDataNameList", "setAndroidBaseDataNameList", "androidBaseModelNameList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAndroidBaseModelNameList", "()Ljava/util/ArrayList;", "setAndroidBaseModelNameList", "(Ljava/util/ArrayList;)V", "androidDatabase", "Lcom/example/chatandroid/logic/model/AndroidDatabase;", "getAndroidDatabase", "()Lcom/example/chatandroid/logic/model/AndroidDatabase;", "setAndroidDatabase", "(Lcom/example/chatandroid/logic/model/AndroidDatabase;)V", "length", "", "getLength", "()I", "setLength", "(I)V", "token", "getToken", "setToken", "(Ljava/lang/String;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "flags", "startId", "Companion", "app_debug"})
public final class AndroidBaseService2 extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "Ning_AndroidBaseService";
    private int length = 0;
    public java.util.ArrayList<java.lang.String> androidBaseModelNameList;
    public java.util.List<com.example.chatandroid.logic.model.AndroidBaseModel> androidBaseDataList;
    public com.example.chatandroid.logic.model.AndroidDatabase androidDatabase;
    public java.util.List<java.lang.String> androidBaseDataNameList;
    @org.jetbrains.annotations.NotNull
    private java.lang.String token = "";
    @org.jetbrains.annotations.NotNull
    public static final com.example.chatandroid.logic.network.AndroidBaseService2.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String API_KEY = "5GHSlGSkqlDiGA57zWmilkwp";
    @org.jetbrains.annotations.NotNull
    private static java.lang.String SECRET_KEY = "UAbadAXq7Evl1qbg9j9aWGcXibZ8oNH8";
    @org.jetbrains.annotations.NotNull
    private static okhttp3.logging.HttpLoggingInterceptor interceptor;
    @org.jetbrains.annotations.NotNull
    private static okhttp3.OkHttpClient HTTP_CLIENT;
    
    public AndroidBaseService2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final int getLength() {
        return 0;
    }
    
    public final void setLength(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getAndroidBaseModelNameList() {
        return null;
    }
    
    public final void setAndroidBaseModelNameList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.chatandroid.logic.model.AndroidBaseModel> getAndroidBaseDataList() {
        return null;
    }
    
    public final void setAndroidBaseDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.chatandroid.logic.model.AndroidBaseModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.chatandroid.logic.model.AndroidDatabase getAndroidDatabase() {
        return null;
    }
    
    public final void setAndroidDatabase(@org.jetbrains.annotations.NotNull
    com.example.chatandroid.logic.model.AndroidDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAndroidBaseDataNameList() {
        return null;
    }
    
    public final void setAndroidBaseDataNameList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/example/chatandroid/logic/network/AndroidBaseService2$Companion;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "HTTP_CLIENT", "Lokhttp3/OkHttpClient;", "getHTTP_CLIENT", "()Lokhttp3/OkHttpClient;", "setHTTP_CLIENT", "(Lokhttp3/OkHttpClient;)V", "SECRET_KEY", "getSECRET_KEY", "setSECRET_KEY", "(Ljava/lang/String;)V", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "setInterceptor", "(Lokhttp3/logging/HttpLoggingInterceptor;)V", "staticGetAccessToken", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAPI_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSECRET_KEY() {
            return null;
        }
        
        public final void setSECRET_KEY(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final okhttp3.logging.HttpLoggingInterceptor getInterceptor() {
            return null;
        }
        
        public final void setInterceptor(@org.jetbrains.annotations.NotNull
        okhttp3.logging.HttpLoggingInterceptor p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient getHTTP_CLIENT() {
            return null;
        }
        
        public final void setHTTP_CLIENT(@org.jetbrains.annotations.NotNull
        okhttp3.OkHttpClient p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String staticGetAccessToken() {
            return null;
        }
    }
}