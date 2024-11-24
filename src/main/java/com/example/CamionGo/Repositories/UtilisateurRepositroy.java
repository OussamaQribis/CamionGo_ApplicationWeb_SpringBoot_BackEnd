package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepositroy extends JpaRepository<Utilisateur,Long> {
    boolean existsByEmail(String email);
    Optional<Utilisateur> findByEmail(String email);
    Optional<Utilisateur> findById(Long id);
    @Override
    List<Utilisateur> findAll();
}
