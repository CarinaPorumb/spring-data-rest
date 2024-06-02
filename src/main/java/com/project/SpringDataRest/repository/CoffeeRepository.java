package com.project.SpringDataRest.repository;

import com.project.SpringDataRest.entity.Coffee;
import com.project.SpringDataRest.entity.CoffeeType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(path = "coffees", collectionResourceRel = "all_coffees")
public interface CoffeeRepository extends JpaRepository<Coffee, UUID> {

    Page<Coffee> findByName(String name, Pageable pageable);

    Page<Coffee> findByNameContaining(String name, Pageable pageable);

    Page<Coffee> findByCoffeeType(CoffeeType coffeeType, Pageable pageable);

    Page<Coffee> findByNameAndCoffeeType(String name, CoffeeType coffeeType, Pageable pageable);

    List<Coffee> findByPrice(Integer price);

}