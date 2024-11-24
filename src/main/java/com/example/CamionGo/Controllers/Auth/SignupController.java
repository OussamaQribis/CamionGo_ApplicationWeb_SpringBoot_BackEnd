package com.example.CamionGo.Controllers.Auth;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Utilisateur;
import com.example.CamionGo.Services.Auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignupController {

    private final AuthService authService;

    @Autowired
    public SignupController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public Utilisateur signupCustomer(@RequestBody SignupRequest signupRequest) {
        Utilisateur createdCustomer = authService.createUser(signupRequest);
        if (createdCustomer != null) {
            return createdCustomer;
        } else {
            return null;
        }
    }

}
