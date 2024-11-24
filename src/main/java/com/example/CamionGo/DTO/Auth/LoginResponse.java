package com.example.CamionGo.DTO.Auth;

import com.example.CamionGo.Entities.Utilisateur;
public record LoginResponse(String jwt, Utilisateur user) {
}
