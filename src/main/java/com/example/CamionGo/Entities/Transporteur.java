package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transporteur extends Utilisateur {
 @OneToMany(mappedBy = "transporteur", cascade = CascadeType.ALL)
 @JsonManagedReference
 private List<Commande> livraisonDesCommandes =new ArrayList<>();;
 @OneToOne
 @JoinColumn(name = "transporteur_id")
 @JsonManagedReference
 private Vehicule vehicule ;


}