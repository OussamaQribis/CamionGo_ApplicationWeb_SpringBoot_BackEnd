package com.example.CamionGo.Services.TypeVehicule;

import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Entities.TypeVehicule;
import com.example.CamionGo.Repositories.TypeVehiculeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TypeVehiculeServiceImpl implements TypeVehiculeService{

    private final TypeVehiculeRepository typeVehiculeRepository;
    @Override
    public TypeVehicule createNewTypeVehicule(String nom) {
        TypeVehicule typeVehicule=new TypeVehicule();
        if(nom!=null){
            typeVehicule.setNom(nom);
            return typeVehiculeRepository.save(typeVehicule);
        }
        return null;
    }
    @Override
    public Optional<TypeVehicule> searchByNom(String nom) {
        return typeVehiculeRepository.findByNom(nom);
    }
}
