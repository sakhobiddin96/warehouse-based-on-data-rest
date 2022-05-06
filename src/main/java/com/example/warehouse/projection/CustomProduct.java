package com.example.warehouse.projection;

import com.example.warehouse.entity.Attachment;
import com.example.warehouse.entity.Category;
import com.example.warehouse.entity.Product;
import com.example.warehouse.entity.Unit;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface CustomProduct {
    Category getCategory();
    Attachment getAttachment();
    String getCode();
    Unit getUnit();
    Integer getId();
    String getName();
    boolean isActive();
}
