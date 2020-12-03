package com.neusoft.springbootsell.services;

import com.neusoft.springbootsell.dataobject.SellerInfo;

import java.util.List;

public interface SellerService {

    SellerInfo findOne(String openId);


    List<SellerInfo> findUpAll();

}
