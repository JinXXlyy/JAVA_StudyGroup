package GroupTask1;

/**
 * @Author: WD
 * @Date: 2021/11/2 20:38
 * 图片类
 */
public class Picture {

    private String name;
    private Integer size;

    public Picture() {
    }

    public Picture(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
