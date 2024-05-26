package com.project.SpringDataRest.repository;

import com.project.SpringDataRest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(path = "customer", collectionResourceRel = "all_customers")
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    List<Customer> findByName(String name);

    List<Customer> findByNameContaining(String name);

}