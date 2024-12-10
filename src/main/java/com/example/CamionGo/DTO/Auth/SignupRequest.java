package com.example.CamionGo.DTO.Auth;

import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Enums.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class SignupRequest {

    private String nom;
    private String email;
    private String motDePasse;
    private String telephone;
    private Boolean etat; // active desactive
    private int role; // "Client" أو "Transporteur"



}
