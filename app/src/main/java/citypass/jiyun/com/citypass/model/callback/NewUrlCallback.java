package citypass.jiyun.com.citypass.model.callback;

/**
 * Created by my on 2017/5/14.
 */

public interface NewUrlCallback {
    void success(String result);
    void error(int code, String result);
}
