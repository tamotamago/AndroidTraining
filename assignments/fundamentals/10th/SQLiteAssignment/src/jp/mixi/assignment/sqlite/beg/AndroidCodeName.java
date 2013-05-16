package jp.mixi.assignment.sqlite.beg;

import android.provider.BaseColumns;

/**
 * Created by koya.tamura on 2013/05/16.
 */
public class AndroidCodeName implements BaseColumns {

    public static final String ANDROID_CODE_NAME_TABLE_NAME = "book";

    public static final String ANDROID_CODE_NAME_NAME = "name";
    public static final String ANDROID_CODE_NAME_VERSION = "version";

    private String mName;
    private String mVersion;

    public AndroidCodeName(String mName, String mVersion) {
        this.mName = mName;
        this.mVersion = mVersion;
    }

    public String getmName() {
        return mName;
    }

    public String getmVersion() {
        return mVersion;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmVersion(String mVersion) {
        this.mVersion = mVersion;
    }
}
