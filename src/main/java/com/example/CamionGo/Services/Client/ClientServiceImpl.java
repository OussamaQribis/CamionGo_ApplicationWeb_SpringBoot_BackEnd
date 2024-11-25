package com.example.CamionGo.Services.Client;

import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    private final ClientRepository clientRepository;
    @Override
    public Client createNewClient(Client client) {
        if(client!=null)
        return clientRepository.save(client);
        return null;
    }
}
