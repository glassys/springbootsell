package com.neusoft.springbootsell.services;

import com.neusoft.springbootsell.dataobject.OrderDTO;
import com.neusoft.springbootsell.dataobject.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    //查询全部
    Page<OrderDTO> findList(Pageable pageable);

    //查询单个    //
    OrderDTO findOne(String orderId);

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);
}
