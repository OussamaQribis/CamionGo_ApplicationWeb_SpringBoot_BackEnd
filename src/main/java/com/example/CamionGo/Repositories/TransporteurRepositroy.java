package com.example.CamionGo.Repositories;

import com.example.CamionGo.Entities.Transporteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteurRepositroy extends JpaRepository<Transporteur,Long> {
}
