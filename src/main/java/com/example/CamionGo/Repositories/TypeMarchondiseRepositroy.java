package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.TypeMarchondise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMarchondiseRepositroy extends JpaRepository<TypeMarchondise,Long> {
}
