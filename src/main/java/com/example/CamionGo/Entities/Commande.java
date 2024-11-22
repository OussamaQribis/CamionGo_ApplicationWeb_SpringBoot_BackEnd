package com.example.CamionGo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commande {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String description;
 private String typeMarchandise;
 private Double poids;

 private String adresseDepart;
 private Double coordDepartLatitude;
 private Double coordDepartLongitude;

 private String adresseArrivee;
 private Double coordArriveeLatitude;
 private Double coordArriveeLongitude;

 private String statut; // "Publié", "En cours", "Complété"
 private String typeVehiculeRequis;

 @ManyToOne
 @JoinColumn(name = "client_id")
 private Client client;

 @ManyToOne
 @JoinColumn(name = "transporteur_id", nullable = true)
 private Transporteur transporteur;

}