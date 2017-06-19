package citypass.jiyun.com.citypass.control.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by my on 2017/6/19.
 */

public class TimeUtils {
    private static TimeUtils instance;
    private TimeUtils(){
    }
    public static TimeUtils getInstance(){
        if(instance==null){
            synchronized (TimeUtils.class){
                if(instance==null){
                    instance = new TimeUtils();
                }
            }
        }
        return instance;
    }

    public String getYearTime(long times){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        String str = dateFormat.format(new Date(times));
        return str;
    }

}
