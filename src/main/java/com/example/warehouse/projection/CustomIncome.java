package com.example.warehouse.projection;

import com.example.warehouse.entity.Currency;
import com.example.warehouse.entity.Income;
import com.example.warehouse.entity.Supplier;
import com.example.warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Income.class)
public interface CustomIncome {
    Integer getId();
    Warehouse getWarehouse();
    Timestamp getDate();
    Supplier getSupplier();
    Currency getCurrency();
    Integer getCode();
    Integer getInvoiceNumber();
}
