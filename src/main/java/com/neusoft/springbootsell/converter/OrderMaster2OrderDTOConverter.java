package com.neusoft.springbootsell.converter;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.neusoft.springbootsell.dataobject.OrderDTO;
import com.neusoft.springbootsell.dataobject.OrderMaster;
import org.hibernate.criterion.Order;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e->convert(e)).collect(Collectors.toList());
    }
}
