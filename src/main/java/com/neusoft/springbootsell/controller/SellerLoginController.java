package com.neusoft.springbootsell.controller;

import com.neusoft.springbootsell.dataobject.SellerInfo;
import com.neusoft.springbootsell.form.SellerForm;
import com.neusoft.springbootsell.services.SellerLoginService;
import com.neusoft.springbootsell.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/seller/log")
public class SellerLoginController {
    @Autowired
    private SellerLoginService sellerLoginService;


    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("log/login");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid SellerForm form, BindingResult bindingResult, Map<String,Object> map){
        if (bindingResult.hasErrors()){
            // 返回错误页面
            map.put("msg", bindingResult.getFieldError().getDefaultMessage());
            map.put("url", "/seller/log");
            return new ModelAndView("common/error", map);
        }


        if (form.getPassword().equals(sellerLoginService.findPasswordById(form.getId()))){
            map.put("msg", "欢迎"+sellerLoginService.findSellerNameById(form.getId())+"回来！");
            map.put("url", "/seller/product/list");
            return new ModelAndView("common/success", map);
        }
        else {
            map.put("msg", "Id密码错误!");
            map.put("url", "/seller/log");
            return new ModelAndView("common/error", map);
        }
    }
}
