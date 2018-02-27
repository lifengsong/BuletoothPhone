package lifengsong.com.buletoothphone.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lilei on 2018/2/25.
 */

public class BaseActivity extends AppCompatActivity {
    private static String TAG = BaseActivity.class.getSimpleName();
    //Use this activity to start activity
    public static BaseActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        activity = this;
        init();
    }

    @Override
    protected void onResume() {
        super.onResume();
        activity = this;
    }

    @Override
    protected void onPause() {
        super.onPause();
        activity = null;
    }

    private void init() {
        initData();
        initEvents();
    }

    /**
     * init data
     */
    protected void initData() {

    }

    /**
     * init Events
     */
    protected void initEvents() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}