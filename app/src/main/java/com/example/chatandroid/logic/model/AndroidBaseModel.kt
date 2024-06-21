package com.example.chatandroid.logic.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AndroidBase")
data class AndroidBaseModel(

    @PrimaryKey
    @ColumnInfo(name = "name" , typeAffinity = ColumnInfo.TEXT)
    val name: String ,
    @ColumnInfo(name = "content" , typeAffinity = ColumnInfo.TEXT)
    val content: String
    ) {
}