package com.example.CamionGo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "typeMarchondise_id")
    @JsonManagedReference
    private TypeMarchondise typeMarchondise;
    @ManyToOne
    @JoinColumn(name = "typeVehicule_id")
    @JsonManagedReference
    private TypeVehicule typeVehicule;
    private int poids;
    private String numMatriculation;
    private String numMatriculationRemoque;
    @OneToOne(mappedBy = "vehicule")
    @JsonBackReference
    private Transporteur transporteur;

}
