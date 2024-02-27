package com.example.userorderservice.model;

import com.example.userorderservice.util.ApplicationConstants;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Data
public class OrderedProductDetails {
    @Id
    @UuidGenerator
    private String orderedProductId;
    @ManyToOne
    @JoinColumn(name = ApplicationConstants.ORDER_FOREIGN_KEY)
    OrderDetails orderDetails;
    @OneToOne
    @JoinColumn(name = ApplicationConstants.PRODUCT_FOREIGN_KEY)
    ProductDetails productDetails;

    private int quantity;
}
