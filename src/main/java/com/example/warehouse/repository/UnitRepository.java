package com.example.warehouse.repository;

import com.example.warehouse.entity.Unit;
import com.example.warehouse.projection.CustomUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "unit",excerptProjection = CustomUnit.class)
public interface UnitRepository extends JpaRepository<Unit,Integer> {
    boolean existsByName(String name);
}
