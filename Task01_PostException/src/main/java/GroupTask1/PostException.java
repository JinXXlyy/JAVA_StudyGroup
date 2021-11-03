package GroupTask1;

/**
 * 自定义异常：发帖异常
 * @Author: WD
 * @Date: 2021/11/2 21:13
 */
public class PostException extends Exception{
    public PostException(String message) {
        super(message);
    }

    public PostException() {
    }
}
