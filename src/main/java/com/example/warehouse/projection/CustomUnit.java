package com.example.warehouse.projection;

import com.example.warehouse.entity.Unit;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Unit.class)
public interface CustomUnit {
     Integer getId();
     String getName();
     boolean isActive();
}
