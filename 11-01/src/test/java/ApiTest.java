import com.alibaba.fastjson.JSON;
import org.cxy.demo.Activity;
import org.cxy.demo.WebController2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private WebController2 activityController = new WebController2();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {


        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {} {}", activity.toString(),req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }

}
