package com.example.CamionGo.Services.Transporteur;

import com.example.CamionGo.Entities.Transporteur;
import com.example.CamionGo.Repositories.TransporteurRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransporteurServiceImpl implements TransporteurService{
    private final TransporteurRepositroy transporteurRepositroy;
    @Override
    public Transporteur createNewTransporteur(Transporteur transporteur) {
        if(transporteur!=null)
            return transporteurRepositroy.save(transporteur);
        return null;
    }
}
