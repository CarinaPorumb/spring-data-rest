package com.project.SpringDataRest.repository;

import com.project.SpringDataRest.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "coffee", collectionResourceRel = "all_coffees")
public interface CoffeeRepository extends JpaRepository<Coffee, UUID> {


}