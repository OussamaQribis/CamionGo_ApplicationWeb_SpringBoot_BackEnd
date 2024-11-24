package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepositroy extends JpaRepository<Vehicule,Long> {
}
