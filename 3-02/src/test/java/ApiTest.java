import org.cxy.demo.Builder;
import org.junit.Test;


public class ApiTest {

    @Test
    public void testBuilder(){

        // 豪华欧式
        System.out.println(Builder.levelOne(132.52).getDetail());

        // 轻奢田园
        System.out.println(Builder.levelTwo(98.25).getDetail());

        // 现代简约
        System.out.println(Builder.levelTwo(85.43).getDetail());
    }

}
