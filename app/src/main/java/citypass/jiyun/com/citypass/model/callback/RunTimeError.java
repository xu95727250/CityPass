package citypass.jiyun.com.citypass.model.callback;

/**
 * Created by 123 on 2017/6/9.
 */

public class RunTimeError extends RuntimeException{
    public RunTimeError(String ErrorMsg){
        super(ErrorMsg);
    }
}
