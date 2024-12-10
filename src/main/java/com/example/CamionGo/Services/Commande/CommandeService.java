package com.example.CamionGo.Services.Commande;

import com.example.CamionGo.Entities.Commande;

import java.util.List;

public interface CommandeService {

    Commande createNewCommande(Commande commande);
    Commande searchById(Long id);

    List<Commande> getAllCommandes();
}
