package com.example.chatandroid.logic.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/chatandroid/logic/dao/AndroidBaseModelDao;", "", "deleteAndroidBase", "", "androidBaseModel", "Lcom/example/chatandroid/logic/model/AndroidBaseModel;", "getModelByName", "name", "", "getModelList", "", "insertAndroidBase", "updateAndroidBase", "app_debug"})
public abstract interface AndroidBaseModelDao {
    
    @androidx.room.Insert
    public abstract void insertAndroidBase(@org.jetbrains.annotations.NotNull
    com.example.chatandroid.logic.model.AndroidBaseModel androidBaseModel);
    
    @androidx.room.Delete
    public abstract void deleteAndroidBase(@org.jetbrains.annotations.NotNull
    com.example.chatandroid.logic.model.AndroidBaseModel androidBaseModel);
    
    @androidx.room.Update
    public abstract void updateAndroidBase(@org.jetbrains.annotations.NotNull
    com.example.chatandroid.logic.model.AndroidBaseModel androidBaseModel);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM AndroidBase")
    public abstract java.util.List<com.example.chatandroid.logic.model.AndroidBaseModel> getModelList();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM AndroidBase WHERE name = :name")
    public abstract com.example.chatandroid.logic.model.AndroidBaseModel getModelByName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}