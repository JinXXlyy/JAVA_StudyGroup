package GroupTask1;

import java.util.Locale;

/**
 * 实现issue接口
 * @Author: WD
 * @Date: 2021/11/2 21:22
 */
public class IssueImpl implements Issue{
    @Override
    public boolean issue(Post post) throws PostException {
        String heading = post.getHeading();
        Picture[] pictures = post.getPictures();

        int picSize ;
        String picName ;
        String suffix ;
        int maxLen = 20;
        int maxNum = 9;

        if (heading.length() > maxLen) {
            throw new PostException("您设置的标题过长，请重新设置！");
        } else if (pictures.length > maxNum) {
            throw new PostException("您插入的图片数量超出最大限制！");
        }

        for (Picture picture : pictures) {
            picName = picture.getName();
            picSize = picture.getSize();
            suffix = picName.substring(picName.length() - 4).toLowerCase(Locale.ROOT);
            // 判断图片后缀名是否为png或jpg;还有图片大小是否超出最大限制
            if (!".png".equals(suffix) && !".jpg".equals(suffix)) {
                throw new PostException("不支持非png或jpg格式的图片！");
            } else if (picSize > 10240) {
                throw new PostException("图片不能大于10MB");
            }
        }
        return true;
    }

}
