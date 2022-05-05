package com.example.warehouse.projection;
import com.example.warehouse.entity.User;
import com.example.warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;
import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
     int getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
     int getCode();
     String getPassword();
     boolean isActive();
     Set<Warehouse> getWarehouses();
}
