package com.neusoft.springbootsell.services;

import com.neusoft.springbootsell.dataobject.SellerInfo;



public interface SellerLoginService {
    public SellerInfo findOne(String Id);

    public String findPasswordById(String Id);

    public String findSellerNameById(String Id);

    public SellerInfo save(SellerInfo sellerInfo);
}
