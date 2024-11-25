package com.example.CamionGo.Services.Auth;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Client;
import com.example.CamionGo.Entities.Transporteur;
import com.example.CamionGo.Entities.Utilisateur;
import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Enums.Role;
import com.example.CamionGo.Repositories.ClientRepository;
import com.example.CamionGo.Repositories.TransporteurRepositroy;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import com.example.CamionGo.Services.Vehicule.VehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UtilisateurRepositroy userRepository;
    private final ClientRepository clientRepository;
    private final TransporteurRepositroy transporteurRepositroy;
    private final PasswordEncoder passwordEncoder;
    private final VehiculeService vehiculeService;



    @Override
    public Utilisateur createUser(SignupRequest signupRequest) {
        //Check if Request is Client or Transporteur already exist
        if(signupRequest.getRole().equals(Role.CLIENT)){
            //Check if Client  already exist
            if (clientRepository.existsByEmail(signupRequest.getEmail())) {
                return null;
            }else{
                Client client= new Client();
                BeanUtils.copyProperties(signupRequest,client);
                client.setRole(Role.CLIENT);
                client.setEmail(signupRequest.getEmail());
                client.setEtat(signupRequest.getEtat());
                client.setNom(signupRequest.getNom());
                client.setTelephone(signupRequest.getTelephone());
                //Hash the password before saving
                String hashPassword = passwordEncoder.encode(signupRequest.getMotDePasse());
                client.setMotDePasse(hashPassword);
                return clientRepository.save(client);
            }

        }
        if(signupRequest.getRole().equals(Role.TRANSPORTEUR)){
            Transporteur transporteur= new Transporteur();
            BeanUtils.copyProperties(signupRequest,transporteur);
            transporteur.setRole(Role.TRANSPORTEUR);
            transporteur.setEmail(signupRequest.getEmail());
            transporteur.setEtat(signupRequest.getEtat());
            transporteur.setNom(signupRequest.getNom());
            transporteur.setTelephone(signupRequest.getTelephone());
            //Hash the password before saving
            String hashPassword = passwordEncoder.encode(signupRequest.getMotDePasse());
            transporteur.setMotDePasse(hashPassword);
            /*
            //add vehicule
            Vehicule vehicule=new Vehicule();
            vehicule.setType(signupRequest.getType());
            vehicule.setPoids(signupRequest.getPoids());
            vehicule.setNumMatriculation(signupRequest.getNumMatriculation());
            vehicule.setNumMatriculationRemoque(signupRequest.getNumMatriculationRemoque());
            vehicule.setTransporteur(transporteur);
            */
            return transporteurRepositroy.save(transporteur);

        }
        /*if(signupRequest.getRole().equals(Role.ADMIN)){

        }*/
        return null;
    }
}
