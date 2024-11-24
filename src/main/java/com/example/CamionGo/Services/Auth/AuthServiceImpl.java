package com.example.CamionGo.Services.Auth;

import com.example.CamionGo.DTO.Auth.SignupRequest;
import com.example.CamionGo.Entities.Utilisateur;
import com.example.CamionGo.Enums.Role;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UtilisateurRepositroy userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthServiceImpl(UtilisateurRepositroy customerRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public Utilisateur createUser(SignupRequest signupRequest) {
        //Check if Utilisateur already exist
        if (userRepository.existsByEmail(signupRequest.getEmail())) {
            return null;
        }else{
            Utilisateur utilisateur= new Utilisateur() {};
            BeanUtils.copyProperties(signupRequest,utilisateur);
            if(signupRequest.getRole().equals(Role.CLIENT)){
                utilisateur.setRole(Role.CLIENT);
            }
            if(signupRequest.getRole().equals(Role.TRANSPORTEUR)){
                utilisateur.setRole(Role.TRANSPORTEUR);
            }
            //Hash the password before saving
            String hashPassword = passwordEncoder.encode(signupRequest.getMotDePasse());
            utilisateur.setMotDePasse(hashPassword);
            Utilisateur createdCustomer = userRepository.save(utilisateur);
            utilisateur.setId(createdCustomer.getId());
            return utilisateur;}


    }
}
