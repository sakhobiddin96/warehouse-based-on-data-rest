package com.example.warehouse.projection;

import com.example.warehouse.entity.Income;
import com.example.warehouse.entity.InputProduct;
import com.example.warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    int getId();

    Product getProduct();

    double getAmount();

    Date getExpireDate();

    Income getIncome();
}
