import org.cxy.demo.pay.channel.WxPay;
import org.cxy.demo.pay.channel.ZfbPay;
import org.cxy.demo.pay.mode.PayCypher;
import org.cxy.demo.pay.mode.PayFaceMode;
import org.junit.Test;
import java.math.BigDecimal;



public class ApiTest {

    @Test
    public void test_pay() {
        WxPay wxpay = new WxPay(new PayCypher());

        wxpay.transfer("weixin_1092033111", "100000109893", new BigDecimal("100"));

        ZfbPay pay = new ZfbPay(new PayFaceMode());

        pay.transfer("jlu19dlxo111", "202108201111", new BigDecimal("20"));
    }

}
