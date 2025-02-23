package com.example.msordonnance.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Medicament {

    private Long idMed;

    private String nom;

    private int duree;

    private String dosage;

    private double cout;

    @ManyToOne
    private Ordonnance ordonnance;

}
