package info.adavis.topsy.turvey.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.LinearLayout;


public class TopsyTurveyDataSource {
    private SQLiteDatabase database;
    private DatabaseSQLiteOpenHelper dbHelper;

    private static final String TAG=TopsyTurveyDataSource.class.getSimpleName();

    public TopsyTurveyDataSource(Context context){
        this.dbHelper= new DatabaseSQLiteOpenHelper(context);
    }

    public void open(){
        this.database=dbHelper.getWritableDatabase();
        Log.d(TAG, "databse is opened");
    }

    public void close(){
        dbHelper.close();
        Log.d(TAG,"databse is closed");
    }
}
