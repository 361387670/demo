package service.impl;

import entity.OrderInfo;
import org.springframework.stereotype.Component;
import service.OrderStrategyService;

@Component("Overseas")
public class OrderOverseas implements OrderStrategyService {
    @Override
    public String preCreateOrder(OrderInfo orderInfo) {
        System.out.println("**处理海外预下单的相关业务**");
        return orderInfo.getPlatFormType()+"-海外预下单";
    }
}
