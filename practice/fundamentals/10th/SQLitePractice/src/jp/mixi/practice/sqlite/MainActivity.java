
package jp.mixi.practice.sqlite;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Insert).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                insert();
            }
        });
        findViewById(R.id.Delete).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
            }
        });
        findViewById(R.id.Update).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });
        findViewById(R.id.Query).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                query();
            }
        });

    }

    private void insert() {
        // TODO:ここにinsert処理を実装してください
        BookOpenHelper bookOpenHelper = new BookOpenHelper(this);
        SQLiteDatabase db = bookOpenHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Book.COLUMN_NAME_BOOK_TITLE, "title1");
        contentValues.put(Book.COLUMN_NAME_BOOK_PRICE, "price1");
        contentValues.put(Book.COLUMN_NAME_BOOK_PUBLISHER, "publisher1");
        long rowID = db.insert(Book.BOOK_TABLE_NAME, null, contentValues);
        Log.d(this.getLocalClassName(), "insert");
    }

    private void delete() {
        // TODO:ここにdelete処理を実装してください
    }

    private void update() {
        // TODO:ここにupdate処理を実装してください
    }

    private void query() {
        // TODO:ここにquery処理を実装してください
        BookOpenHelper bookOpenHelper = new BookOpenHelper(this);
        SQLiteDatabase db = bookOpenHelper.getReadableDatabase();
        String[] projection = {
                Book._ID,
                Book.COLUMN_NAME_BOOK_TITLE,
                Book.COLUMN_NAME_BOOK_PRICE,
                Book.COLUMN_NAME_BOOK_PUBLISHER
        };

//        String selection = Book._ID + " = ?";
//        String[] selectionArgs = {
//                "1"
//        };
        Cursor cursor = db.query(Book.BOOK_TABLE_NAME, projection, null, null, null, null, null);
        while (cursor.moveToNext()){
            long itemID = cursor.getLong(cursor.getColumnIndexOrThrow(Book._ID));
            Log.d(this.getLocalClassName(), Long.toString(itemID));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
