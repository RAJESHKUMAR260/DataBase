package com.example.database;

public class Temp {

    public static DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public static void setDatabaseHelper(DatabaseHelper databaseHelper) {
        Temp.databaseHelper = databaseHelper;
    }

    public static DatabaseHelper databaseHelper;
}
