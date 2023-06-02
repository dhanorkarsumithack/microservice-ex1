package com.sumit.user.service.controller;

import com.sumit.user.service.entities.User;
import com.sumit.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1= userService.saveuser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/get/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user= userService.getUser(userId);
        return ResponseEntity.ok(user);
    }


    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser=userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }
}
