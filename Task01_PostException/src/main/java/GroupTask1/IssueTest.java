package GroupTask1;

import cn.hutool.core.io.file.FileWriter;

/**
 * @Author: WD
 * @Date: 2021/11/2 21:23
 */
public class IssueTest {

    public static void main(String[] args) {

        String bannerWords = "(普信|暴风吸入|绝绝子|yyds|jio|无语子|集美|真下头)";
        String txt1 = "今日份仙女营业啦 今天去买奶茶鸭，救命~我真的哭死~\n" +
                "呜呜呜这家店的奶茶真是yyds 啊啊啊啊啊啊蛋糕也是绝绝子 ！我暴风吸入\n " +
                "好喝到跺jiojio！路上还看见一个普信男，无语子，真下头，不管啦，\n" +
                "今天跟集美也是在逃公主的一天 好想谈一场双向奔赴的恋爱呜呜呜 \n";
        String txt2 = "香稻啄余鹦鹉粒，碧梧栖老凤凰枝。";

        Picture pic01 = new Picture("Cat01.jpg", 2048);
        Picture pic02 = new Picture("Cat02.PNG", 5048);
        Picture pic03 = new Picture("Cat03.jpg", 1048);
        Picture pic04 = new Picture("Cat04.png", 8048);
        Picture pic05 = new Picture("Cat05.PNG", 6048);
        Picture pic06 = new Picture("Cat06.jpg", 2048);
        Picture pic07 = new Picture("Cat07.jpg", 5048);
        Picture pic08 = new Picture("Cat08.PNG", 2048);
        Picture pic09 = new Picture("Cat09.jpg", 20480);
        Picture pic10 = new Picture("Cat10.JPG", 2048);
        Picture pic11 = new Picture("Cat10.bmp", 2048);

        // 插入图片,1.无异常版
        Picture[] pictures1 = {pic01,pic02,pic03,pic04,pic05,pic06,pic07,pic08};
        // 2.pic09图片size超出10240
        Picture[] pictures2 = {pic01,pic02,pic03,pic04,pic05,pic06,pic07,pic08,pic09};
        // 3.pic11后缀为.bmp
        Picture[] pictures3 = {pic01,pic02,pic03,pic04,pic05,pic06,pic07,pic11};

        Post post = new Post();
        post.setHeading("网络脑瘫词语大赏");
        post.setPictures(pictures1);
        post.setContent(txt1);
        // 发布帖子
        issueMyPost(bannerWords, post);
    }

    private static void issueMyPost(String bannerWords, Post post) {
        IssueImpl issue = new IssueImpl();
        boolean result = false;

        try {
            result = issue.issue(post);
        } catch (PostException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
        // 若标题和图片无异常抛出，则开始对内容进行敏感词加密，或过滤
        if (result){

            // huTool 文件写入到txt文档
            FileWriter writer = new FileWriter("C:\\Users\\FANGCHAO\\Desktop\\test\\myPost.txt");
            // 替换成”***“,若要过滤则replacement为空;
            String contents = post.getContent().replaceAll(bannerWords,"***");

            writer.append("标题：《" + post.getHeading() + "》\n");
            writer.append("内容：\n" + contents);

        }
    }
}
