package com.example.haditsarbain.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDatabase extends SQLiteOpenHelper {

    //DATABASE NAME
    public static final String DATABASE_NAME = "dbuser";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_USERS = "user";
    public static final String KEY_ID = "id";
    public static final String FIELD_USER_NAME = "username";
    public static final String FIELD_NAMA = "nama";
    public static final String FIELD_PASSWORD = "password";

    public static String CREATE_TABLE_USER = "CREATE TABLE "+TABLE_USERS+
            "( id integer primary key autoincrement, "+
            "username text not null, "+
            "nama text not null, "+
            "password text not null);";

    public UserDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_USERS);
        onCreate(db);
    }
}

