package com.example.warehouse.projection;

import com.example.warehouse.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    String getPhoneNumber();
    Integer getId();
    String getName();
    boolean isActive();
}
