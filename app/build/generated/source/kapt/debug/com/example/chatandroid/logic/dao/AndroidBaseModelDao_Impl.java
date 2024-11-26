package com.example.chatandroid.logic.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.chatandroid.logic.model.AndroidBaseModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AndroidBaseModelDao_Impl implements AndroidBaseModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AndroidBaseModel> __insertionAdapterOfAndroidBaseModel;

  private final EntityDeletionOrUpdateAdapter<AndroidBaseModel> __deletionAdapterOfAndroidBaseModel;

  private final EntityDeletionOrUpdateAdapter<AndroidBaseModel> __updateAdapterOfAndroidBaseModel;

  public AndroidBaseModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAndroidBaseModel = new EntityInsertionAdapter<AndroidBaseModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AndroidBase` (`name`,`content`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AndroidBaseModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
      }
    };
    this.__deletionAdapterOfAndroidBaseModel = new EntityDeletionOrUpdateAdapter<AndroidBaseModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `AndroidBase` WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AndroidBaseModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
      }
    };
    this.__updateAdapterOfAndroidBaseModel = new EntityDeletionOrUpdateAdapter<AndroidBaseModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `AndroidBase` SET `name` = ?,`content` = ? WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AndroidBaseModel value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
      }
    };
  }

  @Override
  public void insertAndroidBase(final AndroidBaseModel androidBaseModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAndroidBaseModel.insert(androidBaseModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAndroidBase(final AndroidBaseModel androidBaseModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAndroidBaseModel.handle(androidBaseModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateAndroidBase(final AndroidBaseModel androidBaseModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAndroidBaseModel.handle(androidBaseModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<AndroidBaseModel> getModelList() {
    final String _sql = "SELECT * FROM AndroidBase";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final List<AndroidBaseModel> _result = new ArrayList<AndroidBaseModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AndroidBaseModel _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        _item = new AndroidBaseModel(_tmpName,_tmpContent);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public AndroidBaseModel getModelByName(final String name) {
    final String _sql = "SELECT * FROM AndroidBase WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final AndroidBaseModel _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        _result = new AndroidBaseModel(_tmpName,_tmpContent);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
