package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "typeVehicule_id")
    @JsonManagedReference
    private TypeVehicule typeVehicule;
    @OneToOne
    @JoinColumn(name = "typeMarchondise_id")
    @JsonManagedReference
    private TypeMarchondise typeMarchondise;
    private Double poids;
    private String numMatriculation;
    private String numMatriculationRemoque;
    @OneToOne(mappedBy = "vehicule")
    @JsonBackReference
    private Transporteur transporteur;

}
