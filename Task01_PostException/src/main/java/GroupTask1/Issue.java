package GroupTask1;

/**
 * @Author: WD
 * @Date: 2021/11/2 21:15
 */
public interface Issue {
    /**
     * issue 方法
     * @param post 帖子类
     * @return boolean
     * @throws PostException 发帖时异常
     */
    boolean issue(Post post)throws PostException;
}
