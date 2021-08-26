package service.impl;

import entity.OrderInfo;
import org.springframework.stereotype.Component;
import service.OrderStrategyService;

@Component("Domestic")
public class OrderDomestic implements OrderStrategyService {
    @Override
    public String preCreateOrder(OrderInfo orderInfo) {
        System.out.println("*处理国内预下单的相关业务*");
        return orderInfo.getPlatFormType()+"-国内预下单";
    }
}
