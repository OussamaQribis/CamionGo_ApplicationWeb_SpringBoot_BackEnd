package com.example.CamionGo.Services.TypeMarchondise;

import com.example.CamionGo.Entities.TypeMarchondise;

import java.util.Optional;

public interface TypeMarchondiseService {
    TypeMarchondise createNewTypeMarchondise(String nom);
    Optional<TypeMarchondise> searchByNom(String nom);
}
