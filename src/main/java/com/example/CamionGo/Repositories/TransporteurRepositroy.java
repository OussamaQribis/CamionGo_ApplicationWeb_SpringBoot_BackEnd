package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Transporteur;
import com.example.CamionGo.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransporteurRepositroy extends JpaRepository<Transporteur,Long> {
    boolean existsByEmail(String email);
    Optional<Transporteur> findByEmail(String email);
    Optional<Transporteur> findById(Long id);
    @Override
    List<Transporteur> findAll();

}
