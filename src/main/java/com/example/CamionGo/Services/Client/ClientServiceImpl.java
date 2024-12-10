package com.example.CamionGo.Services.Client;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Utilisateur;
import com.example.CamionGo.Repositories.ClientRepository;
import com.example.CamionGo.Services.Auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository;
    private final AuthService authService;
    @Override
    public Utilisateur createNewClient(SignupRequest signupRequest) {
        if(signupRequest!=null)
        return authService.createUser(signupRequest);
        return null;
    }

    @Override
    public Client searchById(Long id) {
        return clientRepository.findById(id).get();
    }
}
