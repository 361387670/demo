package service.impl;

import entity.OrderInfo;
import org.springframework.stereotype.Component;
import service.OrderStrategyService;


@Component("Rebate")
public class OrderRebate implements OrderStrategyService {
    @Override
    public String preCreateOrder(OrderInfo orderInfo) {
        System.out.println("***处理国内特殊回扣预下单的相关业务***");
        return orderInfo.getPlatFormType()+"-特殊回扣预下单";
    }
}
