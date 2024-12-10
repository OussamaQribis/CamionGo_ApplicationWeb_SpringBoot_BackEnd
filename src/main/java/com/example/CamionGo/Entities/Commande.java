package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nomDeCommande;
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
 @JsonManagedReference
 private Client client;
 @OneToMany(mappedBy = "commande",  cascade = CascadeType.ALL)
 @JsonBackReference
 private List<Voyage> voyages =new ArrayList<>();

}