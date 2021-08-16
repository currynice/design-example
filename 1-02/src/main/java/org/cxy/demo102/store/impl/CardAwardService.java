package org.cxy.demo102.store.impl;

import com.alibaba.fastjson.JSON;
import org.cxy.demo100.card.IQiYiCardService;
import org.cxy.demo102.store.IAward;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

/**
 * Description:   </br>
 * Date: 2021/8/16 14:51
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class CardAwardService implements IAward {

    private Logger logger =
            LoggerFactory.getLogger(CardAwardService.class);

    private IQiYiCardService  iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendAward(String uId, String awardNumber, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} awardNumber：{} bizId：{} extMap：{}", uId, awardNumber, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
