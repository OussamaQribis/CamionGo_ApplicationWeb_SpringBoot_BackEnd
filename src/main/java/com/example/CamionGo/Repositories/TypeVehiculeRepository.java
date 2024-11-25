package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Entities.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TypeVehiculeRepository extends JpaRepository<TypeVehicule,Long> {
    Optional<TypeVehicule> findByNom(String nom);
}
