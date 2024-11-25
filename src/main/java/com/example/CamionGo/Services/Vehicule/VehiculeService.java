package com.example.CamionGo.Services.Vehicule;

import com.example.CamionGo.Entities.TypeVehicule;
import com.example.CamionGo.Entities.Vehicule;

public interface VehiculeService {
    Vehicule getVehiculeByTypeVehicule(TypeVehicule typeVehicule);

    Vehicule createNewVehicule(Vehicule vehicule);
}
