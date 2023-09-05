package com.example.AuthorizationService.Controller;
import com.example.AuthorizationService.Enums.Authorities;
import com.example.AuthorizationService.Exception.InvalidCredentials;
import com.example.AuthorizationService.Exception.UnauthorizedUser;
import com.example.AuthorizationService.Service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.lang.System.*;


@RestController
public class AuthorizationController {
    @Autowired
    private AuthorizationService service;


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }


}