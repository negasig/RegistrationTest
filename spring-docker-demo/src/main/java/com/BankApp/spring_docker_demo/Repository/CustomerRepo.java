package com.BankApp.spring_docker_demo.Repository;

import com.BankApp.spring_docker_demo.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
