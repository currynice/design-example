import org.cxy.demo.CacheService;
import org.cxy.demo.CacheServiceImpl;
import org.cxy.demo.factory.MyProxy;
import org.cxy.demo.factory.impl.EGMCacheAdapter;
import org.cxy.demo.factory.impl.IIRCacheAdapter;
import org.junit.Test;

/**
 * Description:   </br>
 * Date: 2021/8/16 17:04
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = MyProxy.getProxy(CacheService.class, new EGMCacheAdapter());
        proxy_EGM.set("test-key", "cxy");
        String val01 = proxy_EGM.get("test-key");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = MyProxy.getProxy(CacheService.class, new IIRCacheAdapter());
        proxy_IIR.set("test-key2", "cxy2");
        String val02 = proxy_IIR.get("test-key2");
        System.out.println("测试结果：" + val02);


        CacheService proxy_default = new CacheServiceImpl();
        proxy_default.set("test-key3", "cxy3");
        String val03 = proxy_default.get("test-key3");
        System.out.println("测试结果：" + val03);


    }
}
