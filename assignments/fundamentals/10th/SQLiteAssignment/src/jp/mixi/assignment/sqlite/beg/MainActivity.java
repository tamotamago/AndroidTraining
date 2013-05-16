
package jp.mixi.assignment.sqlite.beg;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    private AppVersionOpenHelper appVersionOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO:独自SQLiteOpenHelperの作成、それに使用するカラム名などの定義
        // TODO:insert処理、query処理の実装

        appVersionOpenHelper = new AppVersionOpenHelper(this);
        deleteTable();
        insertTable();
        readTable();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void deleteTable(){
        SQLiteDatabase db = appVersionOpenHelper.getWritableDatabase();
        int deletedCount = db.delete(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, nil, nil);
    }

    private void insertTable(){
        SQLiteDatabase db = appVersionOpenHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(AndroidCodeName.ANDROID_CODE_NAME_NAME, "Jelly Bean");
        values.put(AndroidCodeName.ANDROID_CODE_NAME_VERSION, "4.1");
        long rowId = db.insert(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, null, values);

        ContentValues values2 = new ContentValues();
        values2.put(AndroidCodeName.ANDROID_CODE_NAME_NAME, "Icecream Sandwich");
        values2.put(AndroidCodeName.ANDROID_CODE_NAME_VERSION, "4.0");
        rowId = db.insert(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, null, values2);

        ContentValues values3 = new ContentValues();
        values3.put(AndroidCodeName.ANDROID_CODE_NAME_NAME, "Honeycomb");
        values3.put(AndroidCodeName.ANDROID_CODE_NAME_VERSION, "3.x");
        rowId = db.insert(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, null, values3);

        ContentValues values4 = new ContentValues();
        values4.put(AndroidCodeName.ANDROID_CODE_NAME_NAME, "Gingerbread");
        values4.put(AndroidCodeName.ANDROID_CODE_NAME_VERSION, "2.3.x");
        rowId = db.insert(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, null, values4);
    }

    private void readTable(){
        SQLiteDatabase db = appVersionOpenHelper.getReadableDatabase();
        String[] projection = {
                AndroidCodeName._ID,
                AndroidCodeName.ANDROID_CODE_NAME_VERSION,
                AndroidCodeName.ANDROID_CODE_NAME_NAME
        };

        Cursor cursor = db.query(AndroidCodeName.ANDROID_CODE_NAME_TABLE_NAME, projection, null, null, null, null, null);
        while (cursor.moveToNext()){
            long itemID = cursor.getLong(cursor.getColumnIndexOrThrow(Book._ID));
            Log.d(this.getLocalClassName(), Long.toString(itemID));
        }
    }
}
