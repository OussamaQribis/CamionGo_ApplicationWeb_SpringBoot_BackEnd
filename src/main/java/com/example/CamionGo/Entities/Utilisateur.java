package com.example.CamionGo.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
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
private String type; // "Client" أو "Transporteur"


}