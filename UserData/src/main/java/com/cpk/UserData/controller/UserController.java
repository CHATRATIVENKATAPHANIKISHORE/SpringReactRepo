package com.cpk.UserData.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpk.UserData.model.User;
import com.cpk.UserData.repository.UserRepository;

import jakarta.transaction.Transactional;


@RestController
@Transactional 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class UserController {
	
	User myuser;
	
	@Autowired
	UserRepository userRepo;
	
	@PostMapping("/users")
    public String receiveData(@RequestBody  Map<String, Object> payLoad) {
		String username = (String)payLoad.get("username");
		String  email= (String)payLoad.get("email");
		
		
		String  contactNumber= (String)payLoad.get("contactNumber");
		String  gender= (String)payLoad.get("gender");
		String address = (String)payLoad.get("address");
		String pincode = (String)payLoad.get("pincode");
		
		myuser = new User(null,username,email, contactNumber,
				gender,address, pincode);
		userRepo.save(myuser);

		
	
		return "Success";
	}
	
	 @GetMapping("/all")
	    public List<User> allData() {
	       
     	return userRepo.findAll();
     	
     	
     
     
}
	 @GetMapping("/all/{ id }")
	    public Optional<User> getbyid(@PathVariable("id") Long id) {
	       
  	return userRepo.findById(id);

}
	 @DeleteMapping("/delete/{uid}")
	    public void deleteBy(@PathVariable Long uid) {
	       
	 userRepo.deleteByUid(uid);

}
	 
	 @PutMapping("/edit/{uid}")
	    public void editBy(@PathVariable("uid") Long id, @RequestBody  Map<String, Object> payLoad) {
		 userRepo.deleteByUid(id);
		 String username = (String)payLoad.get("username");
			String  email= (String)payLoad.get("email");
			
			
			String  contactNumber= (String)payLoad.get("contactNumber");
			String  gender= (String)payLoad.get("gender");
			String address = (String)payLoad.get("address");
			String pincode = (String)payLoad.get("pincode");
			
			myuser = new User(id,username,email, contactNumber,
					gender,address, pincode);
			userRepo.save(myuser);

	       
	 

}

}
