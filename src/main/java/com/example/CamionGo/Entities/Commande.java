package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String description;
 private String typeMarchandise;
 private String typeVehiculeRequis;
 private Double poids;
 private String adresseDepart;
 private Double coordDepartLatitude;
 private Double coordDepartLongitude;
 private String adresseArrivee;
 private Double coordArriveeLatitude;
 private Double coordArriveeLongitude;
 private Date datePublication;
 private String statut; // "Publié", "En cours", "Complété"
 @ManyToOne
 @JoinColumn(name = "client_id")
 @JsonBackReference
 private Client client;
 @ManyToOne
 @JoinColumn(name = "transporteur_id", nullable = true)
 @JsonBackReference
 private Transporteur transporteur;

}