package com.example.CamionGo.Services.Commande;

import com.example.CamionGo.Entities.Commande;
import com.example.CamionGo.Repositories.CommandeRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService{
    private final CommandeRepositroy commandeRepositroy;
    @Override
    public Commande createNewCommande(Commande commande) {
        if(commande!=null)
            return commandeRepositroy.save(commande);
        return null;
    }

    @Override
    public Commande searchById(Long id) {
        return commandeRepositroy.findById(id).get();
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepositroy.findAll();
    }
}
