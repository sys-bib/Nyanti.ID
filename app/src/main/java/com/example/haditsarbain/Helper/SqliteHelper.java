package com.example.haditsarbain.Helper;

import android.content.ContentValues;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.haditsarbain.Database.UserDatabase;
import com.example.haditsarbain.Model.UserModel;

import java.util.ArrayList;

public class SqliteHelper {

    public static String KEY_ID = "id";
    public static String KEY_USER = UserDatabase.FIELD_USER_NAME;
    public static String KEY_NAMA = UserDatabase.FIELD_NAMA;
    public static String KEY_PASSWORD = UserDatabase.FIELD_PASSWORD;

    public static String DATABASE_TABLE = UserDatabase.TABLE_USERS;

    private Context context;
    private UserDatabase userDatabase;
    private SQLiteDatabase database;
    private SQLiteDatabase databaseRead;

    public SqliteHelper(Context context) {
        this.context = context;
    }

    public SqliteHelper open() throws SQLException {
        userDatabase = new UserDatabase(context);
        database = userDatabase.getWritableDatabase();
        databaseRead = userDatabase.getReadableDatabase();
        return this;
    }

    public void close() {
        userDatabase.close();
    }

    public Cursor querySearch(String username) {
        return database.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE " +
                "kata LIKE '%" + username + "%'", null);
    }

    public ArrayList<UserModel> getSearchUser(String q) {
        ArrayList<UserModel> arrayList = new ArrayList<UserModel>();
        Cursor cursor = querySearch(q);
        cursor.moveToFirst();
        UserModel userModel;
        if (cursor.getCount() > 0) {
            do {
                userModel = new UserModel(cursor.getInt(0),
                        cursor.getString(1), cursor.getString(2), cursor.getString(3));
                arrayList.add(userModel);
                cursor.moveToNext();
            } while (!cursor.isAfterLast());
        }
        cursor.close();
        return arrayList;
    }

    public boolean login(String username, String password) {
        long counter = DatabaseUtils.queryNumEntries(databaseRead, UserDatabase.TABLE_USERS,
                UserDatabase.FIELD_USER_NAME + "=? AND " +UserDatabase.FIELD_PASSWORD +"=?",
                new String[] {username, password});

        if(counter > 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public Cursor queryAllData() {
        return database.rawQuery("SELECT * FROM " + DATABASE_TABLE +
                " ORDER BY username ASC", null);
    }

    public ArrayList<UserModel> getAllData() {
        ArrayList<UserModel> arrayList = new ArrayList<UserModel>();
        Cursor cursor = queryAllData();
        cursor.moveToFirst();
        UserModel userModel;
        if (cursor.getCount() > 0) {
            do {
                userModel = new UserModel(cursor.getInt(0), cursor.getString(1),
                        cursor.getString(2), cursor.getString(3));
                arrayList.add(userModel);
                cursor.moveToNext();
            } while (!cursor.isAfterLast());
        }
        cursor.close();
        return arrayList;
    }

    private ContentValues createContent(String username, String nama, String password) {
        ContentValues values = new ContentValues();
        values.put(KEY_USER, username);
        values.put(KEY_NAMA, nama);
        values.put(KEY_PASSWORD, password);
        return values;
    }

    public long insert(String username, String nama, String password) {
        ContentValues initialValues = createContent(username, nama, password);
        long result = -1;
        try {
            result = database.insertOrThrow(DATABASE_TABLE, null, initialValues);
        }
        catch (SQLException e) {
            Log.v("SQLException", e.toString());
        }
        return result;
    }

    public void update(int id, String username, String nama, String password) {
        ContentValues args = new ContentValues();
        args.put(UserDatabase.FIELD_USER_NAME, username);
        args.put(UserDatabase.FIELD_NAMA, nama);
        args.put(UserDatabase.FIELD_PASSWORD, password);
        database.update(DATABASE_TABLE, args, KEY_ID + "=" + id, null);
    }

    public void delete(int id) {
        database.delete(UserDatabase.TABLE_USERS, "id = '" + id + "'", null);
    }
}

