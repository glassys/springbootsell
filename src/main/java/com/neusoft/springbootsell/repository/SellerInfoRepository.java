package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findOne(String openid);
}
