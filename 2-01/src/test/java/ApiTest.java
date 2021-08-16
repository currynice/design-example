import org.cxy.demo.CacheServiceImpl;
import org.cxy.demo.CacheWithTypeService;
import org.cxy.demo.matter.CacheService;
import org.junit.Test;

/**
 * Description:   </br>
 * Date: 2021/8/16 16:31
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheWithTypeService cacheService = new CacheServiceImpl();

        cacheService.set("test-key", "cxy", 1);
        System.out.println("测试结果 in 1：" + cacheService.get("test-key", 1));
        System.out.println("测试结果 in 2：" + cacheService.get("test-key", 2));


    }
}
