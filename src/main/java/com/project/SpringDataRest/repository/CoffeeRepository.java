package com.project.SpringDataRest.repository;

import com.project.SpringDataRest.entity.Coffee;
import com.project.SpringDataRest.entity.CoffeeType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "coffee", collectionResourceRel = "all_coffees")
public interface CoffeeRepository extends JpaRepository<Coffee, UUID> {

    Page<Coffee> findAllByName(String name, Pageable pageable);

    Page<Coffee> findAllByCoffeeType(CoffeeType coffeeType, Pageable pageable);

    Page<Coffee> findAllByNameAndCoffeeType(String name, CoffeeType coffeeType, Pageable pageable);

    Coffee findByPrice(Integer price);

}