package com.example.CamionGo.Services.Auth;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Utilisateur;

public interface AuthService {
    Utilisateur createUser(SignupRequest signupRequest);
}
