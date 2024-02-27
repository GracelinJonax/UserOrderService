package com.example.userorderservice.api;

import com.example.userorderservice.dto.LoginDto;
import com.example.userorderservice.dto.OrderDto;
import com.example.userorderservice.model.ProductDetails;
import com.example.userorderservice.model.TenantDetails;
import com.example.userorderservice.model.UserDetails;
import com.example.userorderservice.util.ApplicationConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserOrderApi {
    @PostMapping(value = ApplicationConstants.PRODUCT_SAVE_API)
    ResponseEntity<String> saveProduct(@RequestBody ProductDetails productDetails);

    @PostMapping(value = ApplicationConstants.ORDER_SAVE_API)
    ResponseEntity<String> orderProduct(@RequestBody OrderDto orderDto);

    @GetMapping(value = ApplicationConstants.LOGIN_TENANT_API)
    ResponseEntity<String> loginTenant(@RequestBody LoginDto loginDto);

    @GetMapping(value = ApplicationConstants.LOGIN_USER_API)
    ResponseEntity<String> loginUser(@RequestBody LoginDto loginDto);

    @PostMapping(value = ApplicationConstants.USER_SAVE_API)
    ResponseEntity<String> saveUser(@RequestBody UserDetails userDetails);

    @PostMapping(value = ApplicationConstants.TENANT_SAVE_API)
    ResponseEntity<String> saveTenant(@RequestBody TenantDetails tenantDetails);
}
