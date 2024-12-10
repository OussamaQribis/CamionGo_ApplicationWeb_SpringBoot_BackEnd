package com.example.CamionGo.Controllers.CommandeController;

import com.example.CamionGo.Entities.Commande;
import com.example.CamionGo.Services.Commande.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class CommandeController {
    private final CommandeService commandeService;

    @GetMapping("/commandes")
    public List<Commande> getAllCommandes(){
        return commandeService.getAllCommandes();
    }
}
