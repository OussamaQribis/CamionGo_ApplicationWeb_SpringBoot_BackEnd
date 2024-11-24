package com.example.CamionGo.DTO.Auth;

import com.example.CamionGo.Enums.Role;
import lombok.Data;

@Data
public class SignupRequest {

    private String nom;
    private String email;
    private String motDePasse;
    private String telephone;
    private Boolean etat; // active desactive
    private Role role; // "Client" أو "Transporteur"




}
