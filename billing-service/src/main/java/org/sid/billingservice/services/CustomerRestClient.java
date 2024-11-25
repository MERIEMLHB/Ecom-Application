package org.sid.billingservice.services;

import org.sid.customerservice.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CustomerRestClient  {
    @GetMapping(path="/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);
}

