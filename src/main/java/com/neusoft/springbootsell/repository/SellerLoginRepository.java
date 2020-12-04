package com.neusoft.springbootsell.repository;

import com.neusoft.springbootsell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerLoginRepository extends JpaRepository<SellerInfo,String> {

}

