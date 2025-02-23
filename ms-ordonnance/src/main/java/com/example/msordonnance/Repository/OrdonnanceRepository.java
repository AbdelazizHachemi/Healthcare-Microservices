package com.example.msordonnance.Repository;

import com.example.msordonnance.Entities.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {
}
