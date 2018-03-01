package lifengsong.com.buletoothphone.util.common;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by lilei on 2018/3/1.
 */

public class SPUtil {
    private SPUtil() {
        throw new UnsupportedOperationException("can not instance this class!");
    }

    private static SharedPreferences getSharedPreference() {
        return PreferenceManager.getDefaultSharedPreferences(UIUtil.getContext());
    }

    public static void setPrefString(final String key,final String vlaue) {
        getSharedPreference().edit().putString(key,vlaue).commit();
    }

    public static String getPrefString(final String key,final String defValue) {
        return getSharedPreference().getString(key,defValue);
    }

    public static void setPrefBoolean(final String key, final boolean value) {
        getSharedPreference().edit().putBoolean(key,value).commit();
    }

    public static boolean getPrefBoolean (final String key, final boolean defValue) {
        return getSharedPreference().getBoolean(key,defValue);
    }

    public static void setPrefInt(final String key,final int value) {
        getSharedPreference().edit().putInt(key,value).commit();
    }

    public static int getPrefInt(final String key,final int defValue) {
        return getSharedPreference().getInt(key,defValue);
    }

    public static void setPrefFloat(final String key,final float value) {
        getSharedPreference().edit().putFloat(key,value).commit();
    }

    public static float getPrefFloat(final String key,final float defValue) {
        return getSharedPreference().getFloat(key,defValue);
    }

    public static void setPrefLong(final String key,final long value) {
        getSharedPreference().edit().putLong(key,value).commit();
    }

    public static long getPrefLong(final String key,final long defValue) {
        return getSharedPreference().getLong(key,defValue);
    }

    public static boolean hasKey(final String key) {
        return getSharedPreference().contains(key);
    }

    public static void clearSharedPreferences() {
        getSharedPreference().edit().clear().commit();
    }
}
