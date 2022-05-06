package com.example.warehouse.repository;

import com.example.warehouse.projection.CustomSupplier;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepository {
}
