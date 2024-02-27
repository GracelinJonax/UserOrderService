package com.example.userorderservice.model;

import com.example.userorderservice.util.ApplicationConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
public class OrderDetails {

    @Id
    @UuidGenerator
    private String orderId;
    @ManyToOne
    @JoinColumn(name = ApplicationConstants.USER_FOREIGN_KEY)
    UserDetails userDetails;
    private Double totalPrice;
    private String billId;
}
