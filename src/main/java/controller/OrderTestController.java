package controller;


import entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderStrategyContext;
import service.OrderStrategyService;

@RestController
public class OrderTestController {

    @Autowired
    private OrderStrategyContext orderStrategyContext;

    @PostMapping("/testStrategy")
    public String testStrategy(@RequestBody OrderInfo orderInfo){
        OrderStrategyService orderServiceImpl = orderStrategyContext.getResource(orderInfo);
        String resultTest = orderServiceImpl.preCreateOrder(orderInfo);
        return resultTest;

    }


}
