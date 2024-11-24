package com.example.CamionGo.Services.JWT;

import com.example.CamionGo.Entities.Utilisateur;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

public class CustomerServiceImpl implements UserDetailsService {
    private final UtilisateurRepositroy customerRepository;

    @Autowired
    public CustomerServiceImpl(UtilisateurRepositroy customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Write logic to fetch customer from DB
        Utilisateur customer = customerRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur not found with email: " + email));
        return new org.springframework.security.core.userdetails.User(customer.getEmail(), customer.getMotDePasse(), Collections.emptyList());
    }
}
