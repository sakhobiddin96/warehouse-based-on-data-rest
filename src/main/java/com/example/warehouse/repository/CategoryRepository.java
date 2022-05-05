package com.example.warehouse.repository;

import com.example.warehouse.entity.Category;
import com.example.warehouse.projection.CustomCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    @RestResource(path = "byName")
    public Page<Category> findAllByName(@Param("name") String name, Pageable pageable);

}
