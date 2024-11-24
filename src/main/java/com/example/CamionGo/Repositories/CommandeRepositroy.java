package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepositroy extends JpaRepository<Commande,Long> {
}
