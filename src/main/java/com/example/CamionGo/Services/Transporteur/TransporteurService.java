package com.example.CamionGo.Services.Transporteur;

import com.example.CamionGo.Entities.Transporteur;

import java.util.Optional;

public interface TransporteurService {
    Transporteur createNewTransporteur(Transporteur transporteur);
    Optional<Transporteur> searchByEmail(String email);
    Transporteur searchById(Long id);
    Transporteur updateNewTransporteur(Transporteur transporteur);
}
