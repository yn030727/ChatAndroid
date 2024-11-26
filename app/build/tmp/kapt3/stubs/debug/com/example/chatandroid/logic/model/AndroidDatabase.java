package com.example.chatandroid.logic.model;

import java.lang.System;

@androidx.room.Database(entities = {com.example.chatandroid.logic.model.AndroidBaseModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/chatandroid/logic/model/AndroidDatabase;", "Landroidx/room/RoomDatabase;", "()V", "androidBaseModelDao", "Lcom/example/chatandroid/logic/dao/AndroidBaseModelDao;", "Companion", "app_debug"})
public abstract class AndroidDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.chatandroid.logic.model.AndroidDatabase.Companion Companion = null;
    private static final java.lang.String DATABASE_NAME = "my_db";
    private static com.example.chatandroid.logic.model.AndroidDatabase databaseInstance;
    
    public AndroidDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.chatandroid.logic.dao.AndroidBaseModelDao androidBaseModelDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/chatandroid/logic/model/AndroidDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "databaseInstance", "Lcom/example/chatandroid/logic/model/AndroidDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.chatandroid.logic.model.AndroidDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}