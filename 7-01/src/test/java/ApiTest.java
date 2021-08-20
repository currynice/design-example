import org.cxy.demo.PayController;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {
        PayController pay = new PayController();

        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal("100"), 1, 2);
        
        pay.doPay("jlu19dlxo111","100000109894",new BigDecimal("100"), 2, 3);
    }

}
