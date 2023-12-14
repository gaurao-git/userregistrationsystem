package com.user.registration.system.userregistrationsystem.controllers;

import com.user.registration.system.userregistrationsystem.dtos.UserDTO;
import com.user.registration.system.userregistrationsystem.services.UserRegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registrations")
public class UserRegistrationController {
//
    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO){
        this.userRegistrationService.createUser(userDTO);
        return new ResponseEntity<String>("User registered successfully.", HttpStatus.CREATED);
    }

    @PutMapping("/updateUser/{user_id}")
    public ResponseEntity<String> updateUser(@RequestBody UserDTO userDTO){
        this.userRegistrationService.updateUser(userDTO);
        return new ResponseEntity<String>("User updated successfully.", HttpStatus.OK);
    }

    @GetMapping("/getUser/{user_id}")
    public UserDTO getUserById(@PathVariable Integer user_id) {
        return this.userRegistrationService.getUserByID(user_id);
    }

    @DeleteMapping("/{user_id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Integer user_id){
        this.userRegistrationService.deleteUserByID(user_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
