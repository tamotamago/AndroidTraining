package jp.mixi.assignment.sqlite.beg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by koya.tamura on 2013/05/16.
 */
public class AppVersionOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "Practice.db";

    private static final String ANDROID_CODE_NAME_TABLE_CREATE =
            "CREATE TABLE " + AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME + " (" +
                    AndroidCodeName._ID + " INTEGER PRIMARY KEY," +
                    AndroidCodeName.ANDROID_CODE_NAME_NAME + " TEXT NOT NULL, " +
                    AndroidCodeName.ANDROID_CODE_NAME_VERSION + " TEXT NOT NULL";

    private static final String ANDROID_CODE_NAME_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME;

    public AppVersionOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ANDROID_CODE_NAME_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        sqLiteDatabase.execSQL(ANDROID_CODE_NAME_TABLE_DELETE);
        onCreate(sqLiteDatabase);
    }
}
