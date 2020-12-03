package com.neusoft.springbootsell.dataobject;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;


/**
 * 订单详情
 */

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
//    订单id
    private String orderId;
//    商品id
    private String productId;
//    商品名称
    private String productName;
//    商品价格
    private BigDecimal productPrice;
//    商品数量
    private Integer productQuantity;
//    商品图标
    private String productIcon;
}


