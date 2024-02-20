package com.doorstep.a.to.z.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doorstep.a.to.z.service.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,String> {
	

}
