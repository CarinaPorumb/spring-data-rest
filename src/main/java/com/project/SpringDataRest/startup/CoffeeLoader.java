package com.project.SpringDataRest.startup;

import com.project.SpringDataRest.entity.Coffee;
import com.project.SpringDataRest.entity.CoffeeType;
import com.project.SpringDataRest.repository.CoffeeRepository;
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

    @Override
    public void run(String... args) {
        loadCoffeeObjects();
    }

    private synchronized void loadCoffeeObjects() {
        log.debug("Loading initial data. Count is: {}", coffeeRepository.count());


        if (coffeeRepository.count() == 0) {
            Random random = new Random();

            coffeeRepository.save(Coffee.builder()
                    .name("Coffee1")
                    .coffeeType(CoffeeType.CAPPUCCINO)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());

            coffeeRepository.save(Coffee.builder()
                    .name("Coffee2")
                    .coffeeType(CoffeeType.LATTE)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());

            coffeeRepository.save(Coffee.builder()
                    .name("Coffee3")
                    .coffeeType(CoffeeType.MOCHA)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());

            coffeeRepository.save(Coffee.builder()
                    .name("Coffee4")
                    .coffeeType(CoffeeType.CORTADO)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());

            coffeeRepository.save(Coffee.builder()
                    .name("Coffee5")
                    .coffeeType(CoffeeType.FLAT_WHITE)
                    .price(random.nextInt(75))
                    .version(random.nextLong(5))
                    .build());
        }

    }
}