package com.example.CamionGo.Controllers.Auth;

import com.example.CamionGo.DTO.Auth.LoginRequest;
import com.example.CamionGo.DTO.Auth.LoginResponse;
import com.example.CamionGo.Repositories.UtilisateurRepositroy;
import com.example.CamionGo.Services.JWT.CustomerServiceImpl;
import com.example.CamionGo.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationManager authenticationManager;
    private final CustomerServiceImpl customerService;
    private final JwtUtil jwtUtil;
    private final UtilisateurRepositroy userRepository;

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginRequest, HttpServletResponse response) throws IOException {

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getMotDePasse()));
        } catch (BadCredentialsException e) {
            return new LoginResponse(null,null);
        } catch (DisabledException disabledException) {
            return new LoginResponse(null,null);
        }
        final UserDetails userDetails = customerService.loadUserByUsername(loginRequest.getEmail());
        final String jwt = jwtUtil.generateToken(userDetails.getUsername());
        return new LoginResponse(jwt,userRepository.findByEmail(loginRequest.getEmail()).get());
    }

}
