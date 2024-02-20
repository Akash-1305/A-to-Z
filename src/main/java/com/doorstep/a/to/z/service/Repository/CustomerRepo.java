package com.doorstep.a.to.z.service.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doorstep.a.to.z.service.Entity.Customer;

public interface CustomerRepo extends JpaRepository <Customer,Integer> {
	Optional <Customer> findByEmail(String email);

}
