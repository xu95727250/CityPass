package citypass.jiyun.com.citypass.control.tools;

import android.app.ProgressDialog;

import citypass.jiyun.com.citypass.App;

/**
 * Created by my on 2017/6/19.
 */

public class ProgressDialogUtils {
    private ProgressDialog dialogs;
    private static ProgressDialogUtils instance;
    private ProgressDialogUtils(){
        dialogs = new ProgressDialog(App.activity);
        dialogs.setMessage("正在加载");
    }
    public static ProgressDialogUtils getInstance(){
        if(instance==null){
            synchronized (ProgressDialogUtils.class){
                if(instance==null){
                    instance = new ProgressDialogUtils();
                }
            }
        }
        return instance;
    }

    public ProgressDialogUtils showDialog(){
        dialogs.show();
        return this;
    }

    public ProgressDialogUtils showMineDialog(String loadname){
        dialogs.setMessage(loadname);
        dialogs.show();
        return this;
    }

    public ProgressDialogUtils disDialog(){
        dialogs.dismiss();
        return this;
    }

}
