package com.example.userorderservice.feign;

import com.example.userorderservice.dto.OrderBillDto;
import com.example.userorderservice.util.ApplicationConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = ApplicationConstants.FEIGN_NAME, url = ApplicationConstants.FEIGN_URL)
@Async
public interface ProxyFeign {

    @PostMapping(value = ApplicationConstants.FEIGN_ENDPOINT)
    void saveBill(@RequestBody OrderBillDto orderBillDto);
}
