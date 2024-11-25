package com.example.CamionGo.Services.Vehicule;

import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Repositories.VehiculeRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements VehiculeService{
    private final VehiculeRepositroy vehiculeRepositroy;
    @Override
    public Vehicule getVehiculeByType(String type) {
        return vehiculeRepositroy.findByType(type).get();
    }
}
