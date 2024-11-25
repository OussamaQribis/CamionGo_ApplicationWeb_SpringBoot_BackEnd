package com.example.CamionGo.DTO.CommandeDTOs;

import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Transporteur;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandeDTO {
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
    private Long clientId;
    private Long transporteurId;
}
