import com.alibaba.fastjson.JSON;
import org.cxy.demo.adapter.MQAdapter;
import org.cxy.demo.adapter.OrderAdapterService;
import org.cxy.demo.adapter.POPOrderAdapterServiceImpl;
import org.cxy.demo.adapter.SopOrderAdapterServiceImpl;
import org.cxy.demo.entity.RebateInfo;
import org.cxy.demo.message.CreateAccountMq;
import org.cxy.demo.message.SopOrderMq;
import org.junit.Test;


import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ApiTest {


    /**
     * 测试 MQ适配
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws ParseException
     */
    @Test
    public void test_MQAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException {



        HashMap<String, String> link01 = new HashMap<>();
        //
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        CreateAccountMq mq1 = prepareCreateAccountMq();
        RebateInfo rebateInfo01 = MQAdapter.filter(mq1.toString(), link01);
        System.out.println("mq.create_account(适配前)" + mq1.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));


        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        SopOrderMq mq2 = createSopOrderMq();
        RebateInfo rebateInfo02 = MQAdapter.filter(mq2.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + mq2.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }


    /**
     * 测试 接口适配
     */
    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new SopOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }


    private static CreateAccountMq  prepareCreateAccountMq(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = s.parse("2020-06-01 23:20:16");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CreateAccountMq createAccountMq = new CreateAccountMq();
        createAccountMq.setNumber("100001");
        createAccountMq.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        createAccountMq.setAccountDate(parse);
        createAccountMq.setDesc("在校开户");
        return createAccountMq;
    }



    private static SopOrderMq createSopOrderMq(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = s.parse("2020-06-01 23:20:16");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SopOrderMq orderMq = new SopOrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        return orderMq;
    }


}
