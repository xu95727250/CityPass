package citypass.jiyun.com.citypass.model.http;

/**
 * Created by my on 2017/5/13.
 */

public class HttpFactroy {
    private static final int OKHTTP = 1;
    private static final int VOLLEY = 2;
    private static final int RETROFIT = 3;

    public static Ihttp getUrlType(int type){
        Ihttp ihttp = null;
        switch (type){
            case OKHTTP:

                break;
            case VOLLEY:

                break;
            case RETROFIT:

                break;
        }
        return ihttp;
    }

}
