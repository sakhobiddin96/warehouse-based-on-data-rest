package com.example.warehouse.projection;

import com.example.warehouse.entity.Income;
import com.example.warehouse.entity.OutputProduct;
import com.example.warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    int getId();

    Product getProduct();

    double getAmount();

    Date getExpireDate();

    Income getIncome();
}
