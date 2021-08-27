import com.alibaba.fastjson.JSON;
import org.cxy.demo.Activity;
import org.cxy.demo.WebController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private WebController activityController = new WebController();

    @Test
    public void test_queryActivityInfo() {
        Long req = 10001L;
        Activity activity = activityController.queryActivityInfo(req);
        logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
    }

}
