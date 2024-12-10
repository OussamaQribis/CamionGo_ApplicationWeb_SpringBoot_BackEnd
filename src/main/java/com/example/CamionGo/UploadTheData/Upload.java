package com.example.CamionGo.UploadTheData;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.*;
import com.example.CamionGo.Enums.Role;
import com.example.CamionGo.Repositories.ClientRepository;
import com.example.CamionGo.Repositories.TransporteurRepositroy;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import com.example.CamionGo.Services.Auth.AuthService;
import com.example.CamionGo.Services.Client.ClientService;
import com.example.CamionGo.Services.Commande.CommandeService;
import com.example.CamionGo.Services.Transporteur.TransporteurService;
import com.example.CamionGo.Services.TypeMarchondise.TypeMarchondiseService;
import com.example.CamionGo.Services.TypeVehicule.TypeVehiculeService;
import com.example.CamionGo.Services.Vehicule.VehiculeService;
import com.example.CamionGo.Services.Voyage.VoyageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class Upload {
    @Bean
    CommandLineRunner initDataBase(UtilisateurRepositroy utilisateurRepositroy,
                                   ClientService clientService,
                                   CommandeService commandeService,
                                   TransporteurService transporteurService,
                                   TypeMarchondiseService typeMarchondiseService,
                                   TypeVehiculeService typeVehiculeService,
                                   VehiculeService vehiculeService,
                                   VoyageService voyageService,
                                   AuthService authService)
    {
        return args -> {
            // add new Client
            SignupRequest client=new SignupRequest();
            client.setNom("Client");
            client.setEtat(true);
            client.setEmail("client@gmail.com");
            client.setMotDePasse("123");
            client.setTelephone("0645254875");
            client.setRole(1);
            authService.createUser(client);
/*
            // add new  Transporteur
            SignupRequest transporteur=new SignupRequest();
            transporteur.setNom("Transporteur");
            transporteur.setEtat(true);
            transporteur.setEmail("transporteur@gmail.com");
            transporteur.setMotDePasse("123");
            transporteur.setTelephone("0687954215");
            transporteur.setRole(0);
            authService.createUser(transporteur);
*/
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
/*
            // add new vehicule
            Vehicule vehicule=new Vehicule();
            vehicule.setPoids(40);
            vehicule.setNumMatriculation("12345-A-97");
            vehicule.setNumMatriculationRemoque("67890-B-34");
            vehicule.setTypeVehicule(typeVehiculeService.searchByNom("Camion semi-remorque").get());
            vehicule.setTypeMarchondise(typeMarchondiseService.searchByNom("Produits de la mer").get());
            vehicule.setTransporteur(transporteurService.searchByEmail("transporteur@gmail.com").get());
            Vehicule vehicule1 =vehiculeService.createNewVehicule(vehicule);
            Transporteur transporteur1=transporteurService.searchByEmail("transporteur@gmail.com").get();
            transporteur1.setVehicule(vehicule1);
            transporteurService.updateNewTransporteur(transporteur1);

*/

            Commande commande=new Commande();
            commande.setPoids(Double.valueOf(45));
            commande.setClient(clientService.searchById(Long.valueOf(1)));
            //commande.setTransporteur(transporteurService.searchById(Long.valueOf(1)));
            commande.setAdresseDepart("CASABLANCA");
            commande.setNomDeCommande("Commande 1");
            commande.setAdresseArrivee("RABAT");
            commande.setStatut("Publié");
            commande.setDescription("...");
            commande.setCoordDepartLatitude(Double.valueOf(894546));
            commande.setCoordDepartLongitude(Double.valueOf(916343));
            commande.setCoordArriveeLatitude(Double.valueOf(545641));
            commande.setCoordArriveeLongitude(Double.valueOf(416545));
            commande.setDatePublication(new Date());
            commande.setTypeVehiculeRequis("Camion semi-remorque");
            commande.setTypeMarchandise("Produits de la mer");
            Commande commande1=commandeService.createNewCommande(commande);
            System.out.println(commande1.getClient().getNom());
            Client client1=clientService.searchById(1L);
/*
            //add new Voyage
            Voyage voyage=new Voyage();
            voyage.setStatut("Refuce");
            voyage.setTransporteur(transporteurService.searchById(2L));
            voyage.setCommande(commandeService.searchById(1L));
            voyage.setDate(new Date());
            voyageService.createNewVoyage(voyage);


            Transporteur utilisateur=transporteurService.searchByEmail("transporteur@gmail.com").get();
            System.out.println(utilisateur.getVehicule().getTypeMarchondise().getNom());
            *//*
            List<Commande> istCommande2 =commandeService.getAllCommandes();
            System.out.println(istCommande2.get(0).getTypeMarchandise());*/

        };
    }
}
