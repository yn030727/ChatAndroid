package com.example.chatandroid.logic.dao

import androidx.room.*
import com.example.chatandroid.logic.model.AndroidBaseModel

@Dao
interface AndroidBaseModelDao {
    @Insert
    fun insertAndroidBase(androidBaseModel: AndroidBaseModel)

    @Delete
    fun deleteAndroidBase(androidBaseModel: AndroidBaseModel)

    @Update
    fun updateAndroidBase(androidBaseModel: AndroidBaseModel)

    //通过整个AndroidBaseModel类来查询
    @Query("SELECT * FROM AndroidBase")
    fun getModelList(): List<AndroidBaseModel>

    //通过AndroidBaseModel类中的name字段查询
    @Query("SELECT * FROM AndroidBase WHERE name = :name")
    fun getModelByName(name: String): AndroidBaseModel
}