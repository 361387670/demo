package entity;

import lombok.Data;

@Data
public class OrderInfo {
    private String orderId; //订单id
    private String platFormType; //（平台）订单类型
    private Double amount;  //金额
    private String createTime; //创建时间

}
