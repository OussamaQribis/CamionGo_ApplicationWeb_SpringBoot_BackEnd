package com.example.CamionGo.Services.Vehicule;

import com.example.CamionGo.Entities.TypeVehicule;
import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Repositories.VehiculeRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements VehiculeService{
    private final VehiculeRepositroy vehiculeRepositroy;
    @Override
    public Vehicule getVehiculeByTypeVehicule(TypeVehicule typeVehicule) {
        return vehiculeRepositroy.findByTypeVehicule(typeVehicule).get();
    }
    @Override
    public Vehicule createNewVehicule(Vehicule vehicule) {
        if(vehicule!=null)
            return vehiculeRepositroy.save(vehicule);
        return null;
    }
}
