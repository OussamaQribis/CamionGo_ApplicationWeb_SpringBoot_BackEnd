package com.example.CamionGo.Services.Client;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Utilisateur;

import java.util.Optional;

public interface ClientService {

    Utilisateur createNewClient(SignupRequest signupRequest);

    Client searchById(Long id);
}
