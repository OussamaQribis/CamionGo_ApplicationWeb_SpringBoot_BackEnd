package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    boolean existsByEmail(String email);
    Optional<Client> findByEmail(String email);
    Optional<Client> findById(Long id);
    @Override
    List<Client> findAll();
}
