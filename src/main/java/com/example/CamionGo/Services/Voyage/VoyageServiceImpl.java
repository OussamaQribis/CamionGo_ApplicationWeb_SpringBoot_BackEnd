package com.example.CamionGo.Services.Voyage;

import com.example.CamionGo.Entities.Vehicule;
import com.example.CamionGo.Entities.Voyage;
import com.example.CamionGo.Repositories.VoyageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoyageServiceImpl implements VoyageService{

    private final VoyageRepository voyageRepository;
    @Override
    public Voyage createNewVoyage(Voyage voyage) {
        return voyageRepository.save(voyage);
    }
}
