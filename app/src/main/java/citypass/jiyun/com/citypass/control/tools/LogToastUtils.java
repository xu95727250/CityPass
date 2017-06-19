package citypass.jiyun.com.citypass.control.tools;

import android.util.Log;
import android.widget.Toast;

import citypass.jiyun.com.citypass.App;

/**
 * Created by my on 2017/6/19.
 */

public class LogToastUtils {
    private static LogToastUtils instance;
    private LogToastUtils(){
    }
    public static LogToastUtils getInstance(){
        if(instance==null){
            synchronized (LogToastUtils.class){
                if(instance==null){
                    instance = new LogToastUtils();
                }
            }
        }
        return instance;
    }

    public LogToastUtils showLogs(String tag, String content){
        Log.e(tag,content);
        return this;
    }

    public LogToastUtils showToasts(String content){
        Toast.makeText(App.activity, content, Toast.LENGTH_SHORT).show();
        return this;
    }

}
