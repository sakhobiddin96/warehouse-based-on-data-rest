package com.example.warehouse.projection;

import com.example.warehouse.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    boolean isActive();
    Category getParentCategory();
}
