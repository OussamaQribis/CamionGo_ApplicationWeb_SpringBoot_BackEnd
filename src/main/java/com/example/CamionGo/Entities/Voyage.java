package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statut; // "Accepte", "Refuse"
    @ManyToOne
    @JoinColumn(name = "transporteur_id")
    @JsonManagedReference
    private Transporteur transporteur;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    @JsonManagedReference
    private Commande commande;
    private Date date;

}
