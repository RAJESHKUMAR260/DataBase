package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static  final String DB_NAME="Mydatabase";
    public static final int DB_VERSION=5;
    public static final String DB_TABLE="dbtable";

    private static final String KEY_ID = "id";
    public static final String D_NAME="name";
    public static final String D_EMAIL="email";
    public static final String D_PHONE="phone";


    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context,"Mydatabase", null,5);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String s =("CREATE TABLE " + DB_TABLE +"(" +KEY_ID +"INTEGER PRIMARY KEY ,"+D_NAME + "TEXT," +D_EMAIL +"TEXT,"+D_PHONE+"TEXT"+")");
        db.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " +DB_TABLE);
        onCreate(db);
    }
    public int insertUser (User user){
     int i =0;
     SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_ID, User.getId());
        contentValues.put(D_NAME, User.getName());
        contentValues.put(D_EMAIL, User.getEmail());
        contentValues.put(D_PHONE, User.getPhone());
        db.insert(DB_TABLE,null,contentValues);
        db.close();
        i =1;

        return i;
    }

    }

