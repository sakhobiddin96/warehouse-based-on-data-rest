package com.example.warehouse.entity;

import com.example.warehouse.entity.template.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbstractEntity {
}
