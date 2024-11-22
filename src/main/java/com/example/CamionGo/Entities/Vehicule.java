package com.example.CamionGo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // نوع العربة
    private Double capaciteMax;
    private String immatriculation;

    @ManyToOne
    @JoinColumn(name = "transporteur_id")
    private Transporteur transporteur;

}
