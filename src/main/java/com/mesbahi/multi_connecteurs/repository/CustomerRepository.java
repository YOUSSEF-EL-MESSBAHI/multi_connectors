package com.mesbahi.multi_connecteurs.repository;

import com.mesbahi.multi_connecteurs.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
