import com.alibaba.fastjson.JSON;
import org.cxy.demo101.award.AwardController;
import org.cxy.demo101.award.AwardReq;
import org.cxy.demo101.award.AwardRes;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;

/**
 * Description:   </br>
 * Date: 2021/8/16 14:41
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class TestDemo {


    private Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void test_awardToUser() {

        AwardController awardController = new AwardController();

        System.out.println("\r\n模拟发放优惠券测试\r\n");
        // 发放优惠券测试
        AwardReq req01 = new AwardReq();
        req01.setuId("10001");
        req01.setAwardType(1);
        req01.setAwardNumber("EGM1023938910232121323432");
        req01.setBizId("791098764902132");
        AwardRes awardRes01 = awardController.awardToUser(req01);

        logger.info("请求参数：{}", JSON.toJSON(req01));
        logger.info("测试结果：{}", JSON.toJSON(awardRes01));

        System.out.println("\r\n模拟方法实物商品\r\n");
        // 兑换方法实物商品
        AwardReq req02 = new AwardReq();
        req02.setuId("10001");
        req02.setAwardType(2);
        req02.setAwardNumber("9820198721311");
        req02.setBizId("1023000020112221113");
        req02.setExtMap(new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        AwardRes awardRes02 = awardController.awardToUser(req02);
        logger.info("请求参数：{}", JSON.toJSON(req02));
        logger.info("测试结果：{}", JSON.toJSON(awardRes02));


//        兑换第三方兑换卡
        System.out.println("\r\n兑换第三方兑换卡(爱奇艺)\r\n");
        AwardReq req03 = new AwardReq();
        req03.setuId("10001");
        req03.setAwardType(3);
        req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

        AwardRes awardRes03 = awardController.awardToUser(req03);
        logger.info("请求参数：{}", JSON.toJSON(req03));
        logger.info("测试结果：{}", JSON.toJSON(awardRes03));

    }
}
