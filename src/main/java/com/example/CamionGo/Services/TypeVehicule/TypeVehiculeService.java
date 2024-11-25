package com.example.CamionGo.Services.TypeVehicule;

import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Entities.TypeVehicule;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface TypeVehiculeService {
    TypeVehicule createNewTypeVehicule(String nom);

    Optional<TypeVehicule> searchByNom(String nom);
}
