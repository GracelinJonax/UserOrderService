package com.example.userorderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Data
public class ProductDetails {
    @Id
    @UuidGenerator
    private String productId;
    private String name;
    private Double price;
    private Double gst;
}
