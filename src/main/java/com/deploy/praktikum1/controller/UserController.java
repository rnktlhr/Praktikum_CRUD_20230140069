package com.deploy.praktikum1.controller;


import com.deploy.praktikum1.model.dto.UserAddRequest;
import com.deploy.praktikum1.model.dto.UserDto;
import com.deploy.praktikum1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(
            path = "/api/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> AddUser(@RequestBody UserAddRequest request) {
        UserDto result = userService.AddUser(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "status", "success",
                "data", result
        ));
    }
}
