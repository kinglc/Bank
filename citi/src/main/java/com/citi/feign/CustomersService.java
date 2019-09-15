package com.citi.feign;

import com.citi.dto.customers.CustomerBasicName;
import com.citi.dto.customers.CustomerProfile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: YanWenjiang
 * @date: 19/9/15
 * @descriptions:
 */
@FeignClient(value = "customers", url = "https://sandbox.apihub.citi.com/gcb/api")
public interface CustomersService {
    @GetMapping("/v1/customers/profiles")
    CustomerProfile getCustomerProfile();

    @GetMapping("/v1/customers/profiles/basic")
    CustomerBasicName getCustomerBasicName();

}
