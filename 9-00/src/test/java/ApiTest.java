import org.example.demo.HandlerInterceptor;
import org.example.demo.SsoInterceptor;
import org.junit.Test;

/**
 * Description:   </br>
 * Date: 2021/8/25 11:30
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class ApiTest {


    @Test
    public void testA(){
        HandlerInterceptor ssoInterceptor = new SsoInterceptor();
        String  request = "1successhuahua";
        boolean success = ssoInterceptor.preHandle(request, null, "t");
        System.out.println("登录校验：" + request +(success ? " 放行" : " 拦截"));
    }
}
