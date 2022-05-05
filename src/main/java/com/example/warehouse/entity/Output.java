package com.example.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Warehouse warehouse;
    private Timestamp date;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private Currency currency;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private int invoiceNumber;
}
