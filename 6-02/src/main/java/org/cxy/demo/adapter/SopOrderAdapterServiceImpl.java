package org.cxy.demo.adapter;


import org.cxy.demo.service.SopOrderService;


/**
 * 自营
 */
public class SopOrderAdapterServiceImpl implements OrderAdapterService {

    private SopOrderService sopOrderService = new SopOrderService();

    public boolean isFirst(String uId) {
        return sopOrderService.queryUserOrderCount(uId) <= 1;
    }

}
