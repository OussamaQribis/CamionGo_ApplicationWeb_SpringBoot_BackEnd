package com.example.CamionGo.Services.TypeMarchondise;

import com.example.CamionGo.Entities.TypeMarchondise;
import com.example.CamionGo.Repositories.TypeMarchondiseRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TypeMarchondiseServiceImpl implements TypeMarchondiseService{

    private final TypeMarchondiseRepositroy typeMarchondiseRepositroy;
    @Override
    public TypeMarchondise createNewTypeMarchondise(String nom) {
        TypeMarchondise typeMarchondise=new TypeMarchondise();
        if(nom!=null){
            typeMarchondise.setNom(nom);
            return typeMarchondiseRepositroy.save(typeMarchondise);
        }
        return null;
    }

    @Override
    public Optional<TypeMarchondise> searchByNom(String nom) {
        return typeMarchondiseRepositroy.findByNom(nom);
    }

}
