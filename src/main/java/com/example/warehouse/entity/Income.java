package com.example.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income {
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
