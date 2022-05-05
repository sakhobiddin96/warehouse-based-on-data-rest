package com.example.warehouse.repository;

import com.example.warehouse.entity.User;
import com.example.warehouse.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
