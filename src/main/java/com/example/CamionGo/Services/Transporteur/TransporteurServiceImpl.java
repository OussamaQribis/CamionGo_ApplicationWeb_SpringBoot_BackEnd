package com.example.CamionGo.Services.Transporteur;

import com.example.CamionGo.Entities.Transporteur;
import com.example.CamionGo.Repositories.TransporteurRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransporteurServiceImpl implements TransporteurService{
    private final TransporteurRepositroy transporteurRepositroy;
    @Override
    public Transporteur createNewTransporteur(Transporteur transporteur) {
        if(transporteur!=null){
        if(transporteurRepositroy.existsByEmail(transporteur.getEmail())){
            return transporteur;
        }else {return transporteurRepositroy.save(transporteur);}

        }
        return null;
    }
    public Optional<Transporteur> searchByEmail(String email) {
        return transporteurRepositroy.findByEmail(email);
    }

    @Override
    public Transporteur searchById(Long id) {
        return transporteurRepositroy.findById(id).get();
    }

    @Override
    public Transporteur updateNewTransporteur(Transporteur transporteur) {
        if(transporteur!=null){
            return transporteurRepositroy.save(transporteur);

        }
        return null;
    }
}
