package com.doorstep.a.to.z.service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doorstep.a.to.z.service.DTOlogin.LoginDTO;
import com.doorstep.a.to.z.service.Repository.AdminRepo;
import com.doorstep.a.to.z.service.Repository.CustomerRepo;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired 
	private AdminRepo adminrepo;
	
	@Autowired
	private CustomerRepo customerrepo;	
	
	
	@PostMapping("/LoginVerify")
	public ResponseEntity<?> loginVerify(@RequestBody LoginDTO obj){
	if (obj.getUsertype().equals("admin")){
			var admin = adminrepo.findById(obj.getEmail()).orElseThrow(() -> new RuntimeException("Admin Not Found"));
			if (admin.getPass().equals(obj.getPassword())) {
				return new ResponseEntity<>("admin Logged in", HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password");
			}
	}
	else if (obj.getUsertype().equals("customer")) {
		var customer = customerrepo.findByEmail(obj.getEmail()).orElseThrow(() -> new RuntimeException("User Not Found"));
		if (customer.getPassword().equals(obj.getPassword())) {
			return new ResponseEntity<>("user logged in", HttpStatus.OK);
		}
		else {
			throw new RuntimeException("Invalid Password");
		}
	}
	else {
		throw new RuntimeException ("Invalid User Type");
	}
}
}



