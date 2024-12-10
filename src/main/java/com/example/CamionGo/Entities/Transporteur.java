package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Transporteur extends Utilisateur {
 @OneToMany(mappedBy = "transporteur",  cascade = CascadeType.ALL)
 @JsonBackReference
 private List<Voyage> livraisonDesCommandes =new ArrayList<>();;
 @OneToOne
 @JoinColumn(name = "vehicule_id")
 @JsonManagedReference
 private Vehicule vehicule ;


}