package com.neusoft.springbootsell.form;

import com.google.common.annotations.VisibleForTesting;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CategoryForm {
    private String categoryId;

    private String categoryName;

    private Integer categoryType;


}
