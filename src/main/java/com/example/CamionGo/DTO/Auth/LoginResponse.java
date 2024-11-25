package com.example.CamionGo.DTO.Auth;

import com.example.CamionGo.Entities.Utilisateur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public record LoginResponse(String jwt, Utilisateur user) {
}
