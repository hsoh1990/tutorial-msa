package me.wellstone.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class DisplayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplayServiceApplication.class, args);
    }

}
