import org.cxy.demo102.store.AwardFactory;
import org.cxy.demo102.store.IAward;
import org.junit.Test;
import java.util.HashMap;

/**
 * Description:   </br>
 * Date: 2021/8/16 15:24
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class ApiTest {


    @Test
    public void test1() throws Exception{
        AwardFactory awardFactory = new AwardFactory();

        IAward couponAwardService = awardFactory.getAwardService(1);
        couponAwardService.sendAward("10001","EGM1023938910232121323432","791098764902132",null);



        IAward goodsAwardService = awardFactory.getAwardService(2);
        goodsAwardService.sendAward("1001","9820198721311","1023000020112221113",new HashMap<String, String>() {{
            put("consigneeUserName", "cxy");
            put("consigneeUserPhone", "139xxxx6639");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");}});


        IAward cardAwardService = awardFactory.getAwardService(3);

        cardAwardService.sendAward("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);

    }
}
