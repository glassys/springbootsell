package com.neusoft.springbootsell.dataobject;


import com.neusoft.springbootsell.enums.OrderStatusEnum;
import com.neusoft.springbootsell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


//@Entity
@Data
@DynamicUpdate
public class OrderDTO {

    @Id
//订单id
    private String orderId;

//    买家名字
    private String buyerName;

//    买家手机号
    private String buyerPhone;

//    买家地址
    private String buyerAddress;

//    买家微信 openId
    private String buyerOpenId;

//    订单总金额
    private BigDecimal orderAmount;

//    订单状态 默认为0 新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

//    支付状态 默认为0 未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

//    创建时间
    private Date createTime;

//    更新时间
    private Date updateTime;

    //订单详情列表
    List<OrderDetail> orderDetailList;
}
