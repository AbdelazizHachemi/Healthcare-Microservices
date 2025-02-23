package com.example.msordonnance.Repository;

import com.example.msordonnance.Entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
}
