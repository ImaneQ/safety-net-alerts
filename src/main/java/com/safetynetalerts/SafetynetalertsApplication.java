package com.safetynetalerts;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class SafetynetalertsApplication implements CommandLineRunner {

        public static void main(String[] args) {
            SpringApplication.run(SafetynetalertsApplication.class, args);
        }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Test CommandLineRunner");

    }
}

