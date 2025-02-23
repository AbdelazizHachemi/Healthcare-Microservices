package com.example.mspatient.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Anticedent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnticedent;

    private String maladie;

    private Date dateDiagnostic;

    @ManyToOne
    private Patient patient;
}
