package com.example.warehouse.repository;

import com.example.warehouse.entity.Income;
import com.example.warehouse.projection.CustomIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "income",excerptProjection = CustomIncome.class)
public interface IncomeRepository extends JpaRepository<Income,Integer> {
}
