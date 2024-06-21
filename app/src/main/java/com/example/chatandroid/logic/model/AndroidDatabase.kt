package com.example.chatandroid.logic.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.chatandroid.logic.dao.AndroidBaseModelDao

@Database(entities = [AndroidBaseModel::class] , version = 1)
abstract class AndroidDatabase: RoomDatabase() {
    companion object{
        //1.数据库名字
        private const val DATABASE_NAME = "my_db"
        private var databaseInstance: AndroidDatabase ?= null

        fun getInstance(context: Context):AndroidDatabase{
            if(databaseInstance == null){
                databaseInstance = Room.databaseBuilder(
                    context.applicationContext,
                    AndroidDatabase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return databaseInstance as AndroidDatabase
        }
    }

    abstract fun androidBaseModelDao(): AndroidBaseModelDao

}