package citypass.jiyun.com.citypass.model.http;

import java.util.HashMap;

import citypass.jiyun.com.citypass.model.callback.NewUrlCallback;

/**
 * Created by my on 2017/6/19.
 */

public interface Ihttp {
    void doGet(String url, HashMap<String , String> params, NewUrlCallback callback);
    void doPost(String url, HashMap<String , String> params, NewUrlCallback callback);
}
