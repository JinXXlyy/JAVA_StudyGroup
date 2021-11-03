package GroupTask1;

import java.util.Arrays;

/**
 * @Author: WD
 * @Date: 2021/11/2 20:47
 */
public class Post {
    /**
     * 帖子标题
     */
    private String heading;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片数组
     */
    private Picture[] pictures;


    public Post() {
    }

    public Post(String heading, String content, Picture[] pictures) {
        this.heading = heading;
        this.content = content;
        this.pictures = pictures;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Picture[] getPictures() {
        return pictures;
    }

    public void setPictures(Picture[] pictures) {
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Post{" +
                "heading='" + heading + '\'' +
                ", content='" + content + '\'' +
                ", pictures=" + Arrays.toString(pictures) +
                '}';
    }
}
