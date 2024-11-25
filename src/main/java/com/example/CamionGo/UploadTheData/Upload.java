package com.example.CamionGo.UploadTheData;

import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Transporteur;
import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Enums.Role;
import com.example.CamionGo.Repositories.ClientRepository;
import com.example.CamionGo.Repositories.TransporteurRepositroy;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import com.example.CamionGo.Services.Client.ClientService;
import com.example.CamionGo.Services.Commande.CommandeService;
import com.example.CamionGo.Services.Transporteur.TransporteurService;
import com.example.CamionGo.Services.TypeMarchondise.TypeMarchondiseService;
import com.example.CamionGo.Services.TypeVehicule.TypeVehiculeService;
import com.example.CamionGo.Services.Vehicule.VehiculeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Upload {
    @Bean
    CommandLineRunner initDataBase(UtilisateurRepositroy utilisateurRepositroy,
                                   ClientService clientService,
                                   CommandeService commandeService,
                                   TransporteurService transporteurService,
                                   TypeMarchondiseService typeMarchondiseService,
                                   TypeVehiculeService typeVehiculeService,
                                   VehiculeService vehiculeService)
    {
        return args -> {
            // add new Client
            Client client=new Client();
            client.setNom("Client");
            client.setEtat(true);
            client.setEmail("client@gmail.com");
            client.setMotDePasse("123");
            client.setRole(Role.CLIENT);
            clientService.createNewClient(client);

            // add new  Transporteur
            Transporteur transporteur=new Transporteur();
            transporteur.setNom("Transporteur");
            transporteur.setEtat(true);
            transporteur.setEmail("transporteur@gmail.com");
            transporteur.setMotDePasse("123");
            transporteur.setRole(Role.TRANSPORTEUR);
            transporteurService.createNewTransporteur(transporteur);

            // add new type marchondise
            typeMarchondiseService.createNewTypeMarchondise("Produits agricoles");
            typeMarchondiseService.createNewTypeMarchondise("Produits de la mer");
            typeMarchondiseService.createNewTypeMarchondise("Produits industriels");
            typeMarchondiseService.createNewTypeMarchondise("Produits chimiques");
            typeMarchondiseService.createNewTypeMarchondise("Textiles et vetements");
            typeMarchondiseService.createNewTypeMarchondise("Bois et produits forestiers");
            typeMarchondiseService.createNewTypeMarchondise("Bois et produits forestiers");
            typeMarchondiseService.createNewTypeMarchondise("Produits alimentaires transformes");
            typeMarchondiseService.createNewTypeMarchondise("Mineraux et metaux");

            // add new type de vehciule
            typeVehiculeService.createNewTypeVehicule("Camion porte-conteneurs");
            typeVehiculeService.createNewTypeVehicule("Camion semi-remorque");
            typeVehiculeService.createNewTypeVehicule("Camion citerne");
            typeVehiculeService.createNewTypeVehicule("Camion frigorifique");
            typeVehiculeService.createNewTypeVehicule("Camion plateau");
            typeVehiculeService.createNewTypeVehicule("Camion grue");
            typeVehiculeService.createNewTypeVehicule("Camion transporteur de vehicules");
            typeVehiculeService.createNewTypeVehicule("Camion a deshets");

            // add new vehicule

            Vehicule vehicule=new Vehicule();
            vehicule.setPoids(40);
            vehicule.setNumMatriculation("12345-A-97");
            vehicule.setNumMatriculationRemoque("67890-B-34");
            vehicule.setTypeVehicule(typeVehiculeService.searchByNom("Camion semi-remorque").get());
            vehicule.setTypeMarchondise(typeMarchondiseService.searchByNom("Produits de la mer").get());

            System.out.println(vehicule.getTypeVehicule().getNom()+"///"+vehicule.getTypeMarchondise().toString());





        };
    }
}
