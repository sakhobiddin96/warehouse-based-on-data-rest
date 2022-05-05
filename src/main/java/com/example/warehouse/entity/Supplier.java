package com.example.warehouse.entity;

import com.example.warehouse.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Supplier extends AbstractEntity {
    @Column(unique = true,nullable = false)
    private String phoneNumber;
}
