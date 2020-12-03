package com.neusoft.springbootsell.controller;


import com.neusoft.springbootsell.dataobject.ProductInfo;
import com.neusoft.springbootsell.dataobject.SellerInfo;
import com.neusoft.springbootsell.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/seller/log")
public class SellerLogController {
    @Autowired
    private SellerService sellerService;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam("openId") String openId,
                              Map<String, Object> map){

//        try {
            SellerInfo sellerInfo = sellerService.findOne(openId);
            map.put("sellerInfo", sellerInfo);

//        } catch (Exception e) {
//            map.put("msg", e.getMessage());
//            map.put("url", "/seller/product/list");
//            return new ModelAndView("common/error");
//        }
//        map.put("url", "/seller/product/list");
        return new ModelAndView("/log/login", map);

    }

}
