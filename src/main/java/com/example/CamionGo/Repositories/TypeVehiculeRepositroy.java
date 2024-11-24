package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeVehiculeRepositroy extends JpaRepository<TypeVehicule,Long> {
}
