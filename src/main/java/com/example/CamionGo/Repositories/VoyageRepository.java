package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageRepository extends JpaRepository<Voyage,Long> {
}
