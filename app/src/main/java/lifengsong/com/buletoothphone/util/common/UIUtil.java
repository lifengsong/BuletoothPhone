package lifengsong.com.buletoothphone.util.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import lifengsong.com.buletoothphone.MyApplication;
import lifengsong.com.buletoothphone.R;
import lifengsong.com.buletoothphone.activity.BaseActivity;

/**
 * Created by lilei on 2018/2/27.
 */

public class UIUtil {
    public static Context getContext() {
        return MyApplication.getApplication();
    }

    /**
     * Start activity
     * @param intent
     */
    public void startActivity(Intent intent) {
        if (BaseActivity.activity == null) {
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(intent);
        } else {
            BaseActivity.activity.startActivity(intent);
        }
    }

    /**
     * 分享  add
     * @param context
     * @param content 分享内容
     * @param uri 分享图片地址
     */
    public void share(Context context, String content, Uri uri) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        if (uri != null) {
            shareIntent.putExtra(Intent.EXTRA_STREAM,uri);
            shareIntent.setType("image/*");
            shareIntent.putExtra("sms_body",content);
        } else {
            shareIntent.setType("text/plain");
        }
        shareIntent.putExtra(Intent.EXTRA_TEXT,content);
        context.startActivity(Intent.createChooser(shareIntent,context.getResources().getString(R.string.share)));
    }

}
