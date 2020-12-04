package com.neusoft.springbootsell.dataobject;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class SellerInfo {

    @Id
   //     卖家id
    private String Id;

    //   卖家名字
    private String userName;

    //    卖家密码
    private String password;

    //    卖家微信 openId
    private String openId;

    //    创建时间
    private Date createTime;

    //    更新时间
    private Date updateTime;

}
