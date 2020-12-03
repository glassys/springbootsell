package com.neusoft.springbootsell.services.impl;

import com.neusoft.springbootsell.dataobject.SellerInfo;
import com.neusoft.springbootsell.repository.SellerInfoRepository;
import com.neusoft.springbootsell.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl  implements SellerService {
    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findOne(String openId) {
        return repository.findOne(openId);
    }

    @Override
    public List<SellerInfo> findUpAll() {
        return repository.findAll();
    }
}
