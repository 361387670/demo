package service;

import entity.OrderInfo;

public interface OrderStrategyService {
    //预下单
    String  preCreateOrder(OrderInfo orderInfo);
}
