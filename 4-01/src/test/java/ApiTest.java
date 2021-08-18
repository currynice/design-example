import org.cxy.demo.QuestionBankController;
import org.junit.Test;

public class ApiTest {


    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("小V", "1000001921032"));
        System.out.println(questionBankController.createPaper("小李", "1000001921051"));
        System.out.println(questionBankController.createPaper("大张", "1000001921987"));
    }



}
