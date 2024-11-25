package com.example.CamionGo.Entities;


import com.example.CamionGo.Enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Utilisateur {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nom;
 private String email;
 private String motDePasse;
 private String telephone;
 private Boolean etat; // active desactive
 private Role role; // "Client" أو "Transporteur"



}