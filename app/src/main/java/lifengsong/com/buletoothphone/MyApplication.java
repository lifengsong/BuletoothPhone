package lifengsong.com.buletoothphone;

import android.app.Application;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import lifengsong.com.buletoothphone.activity.BaseActivity;

/**
 * Created by lilei on 2018/2/27.
 */

public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();
    private static List<BaseActivity> activities;
    private static Application myApplication;
    private static int mainId;

    @Override
    public void onCreate() {
        super.onCreate();
        activities = new LinkedList<>();
        mainId = android.os.Process.myPid();
        myApplication = this;
    }

    public static Application getApplication() {
        return myApplication;
    }

    public static int getMainId() {
        return mainId;
    }

    public static boolean addActivity(BaseActivity activity) {
        return activities.add(activity);
    }

    public static boolean removeActivity(BaseActivity activity) {
        return activities.remove(activity);
    }

    public void clearActivities() {
        activities.forEach(activity -> {
            if (activity != null) {
                activity.finish();
            }
        });
    }

    public void quitApplication() {
        clearActivities();
        System.exit(0);
    }
}
