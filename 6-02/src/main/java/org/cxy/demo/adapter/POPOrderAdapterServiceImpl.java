package org.cxy.demo.adapter;


import org.cxy.demo.service.PopOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private PopOrderService popOrderService = new PopOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
