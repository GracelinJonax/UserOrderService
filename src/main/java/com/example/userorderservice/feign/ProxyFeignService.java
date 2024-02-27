package com.example.userorderservice.feign;

import com.example.userorderservice.dto.OrderBillDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ProxyFeignService implements ProxyFeign {
    @Resource
    ProxyFeign proxyFeign;

    @Override
    public void saveBill(OrderBillDto orderBillDto) {
        proxyFeign.saveBill(orderBillDto);
    }
}
