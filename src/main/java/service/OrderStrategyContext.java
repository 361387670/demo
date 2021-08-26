package service;

import entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class OrderStrategyContext {

    @Autowired
    private final Map<String, OrderStrategyService> orderStrategyMap = new ConcurrentHashMap();

    public OrderStrategyContext(Map<String, OrderStrategyService> strategyMap) {
        this.orderStrategyMap.clear();
        strategyMap.forEach((k, v) -> this.orderStrategyMap.put(k, v));
    }

    public OrderStrategyService getResource(OrderInfo orderInfo) {
        return orderStrategyMap.get(orderInfo.getPlatFormType());

    }
}
