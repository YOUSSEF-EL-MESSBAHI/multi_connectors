package com.mesbahi.multi_connecteurs;

import com.mesbahi.multi_connecteurs.entity.Customer;
import com.mesbahi.multi_connecteurs.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultiConnecteursApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiConnecteursApplication.class, args);
  }

  @Bean
  CommandLineRunner start(CustomerRepository customerRepository) {
    return args -> {
      customerRepository.save(new Customer(null, "Youssef", "elmessbahiyoussef@gmail.com"));
      customerRepository.save(new Customer(null, "Mohammed", "mohamed@gmail.com"));
    };
  }
}
