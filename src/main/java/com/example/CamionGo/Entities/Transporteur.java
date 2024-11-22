package com.example.CamionGo.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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

 private String numeroLicence;
 private Boolean disponibilite;

 @OneToMany(mappedBy = "transporteur", cascade = CascadeType.ALL)
 private List<Vehicule> vehicules = new ArrayList<>();


}