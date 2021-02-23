package com.my_team.user.controller;


import com.my_team.user.model.dto.UserCreateRequestDto;
import com.my_team.user.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    public ResponseEntity<?> createUser(@Valid @RequestBody UserCreateRequestDto userCreateDto) {
        /**
         * Qui vengono create le risposte
         */
        userService.createUser();
        return null;
    }
}
