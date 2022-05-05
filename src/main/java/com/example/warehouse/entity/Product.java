package com.example.warehouse.entity;

import com.example.warehouse.entity.template.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractEntity {
    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment attachment;
    private String code;
    @ManyToOne
    private Unit unit;
}
