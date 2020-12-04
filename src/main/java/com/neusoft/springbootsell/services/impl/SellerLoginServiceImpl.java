package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.SellerInfo;
import com.neusoft.springbootsell.repository.SellerLoginRepository;
import com.neusoft.springbootsell.services.SellerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerLoginServiceImpl implements SellerLoginService {
    @Autowired
    private SellerLoginRepository repository;

    @Override
    public SellerInfo findOne(String Id) {
        return repository.findOne(Id);
    }

    @Override
    public String findPasswordById(String Id) {
        return repository.findOne(Id).getPassword();

    }

    @Override
    public String findSellerNameById(String Id) {
        return repository.findOne(Id).getUserName();
    }

    @Override
    public SellerInfo save(SellerInfo sellerInfo) {
        return repository.save(sellerInfo);
    }
}
