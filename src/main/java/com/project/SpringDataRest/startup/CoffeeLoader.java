package com.project.SpringDataRest.startup;

import com.project.SpringDataRest.entity.Coffee;
import com.project.SpringDataRest.entity.CoffeeType;
import com.project.SpringDataRest.entity.Customer;
import com.project.SpringDataRest.repository.CoffeeRepository;
import com.project.SpringDataRest.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@RequiredArgsConstructor
@Component
public class CoffeeLoader implements CommandLineRunner {

    private final CoffeeRepository coffeeRepository;
    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) {
        loadCoffeeObjects();
    }

    private synchronized void loadCoffeeObjects() {
        log.debug("Loading initial data. Count is: {}", coffeeRepository.count());
        if (coffeeRepository.count() == 0) {
            Random random = new Random();

            coffeeRepository.save(Coffee.builder()
                    .name("Cappuccino")
                    .coffeeType(CoffeeType.CAPPUCCINO)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());

            coffeeRepository.save(Coffee.builder()
                    .name("Espresso")
                    .coffeeType(CoffeeType.ESPRESSO)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());


            customerRepository.save(Customer.builder()
                    .name("Jane Doe")
                    .build());

            customerRepository.save(Customer.builder()
                    .name("Jane Doe")
                    .build());
        }
    }
}