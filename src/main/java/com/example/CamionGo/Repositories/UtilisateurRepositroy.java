package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepositroy extends JpaRepository<Utilisateur,Long> {
}
