package com.example.msordonnance;

import com.example.msordonnance.Entities.Medicament;
import com.example.msordonnance.Entities.Ordonnance;
import com.example.msordonnance.Repository.MedicamentRepository;
import com.example.msordonnance.Repository.OrdonnanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class MsOrdonnanceApplication implements CommandLineRunner {

    final OrdonnanceRepository ordonnanceRepository;
    final MedicamentRepository medicamentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsOrdonnanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Ordonnance o1 = new Ordonnance(null, new Date(), null, 1L);
        Ordonnance o2 = new Ordonnance(null, new Date(), null, 2L);
        o1=ordonnanceRepository.save(o1);
        o2=ordonnanceRepository.save(o2);

        medicamentRepository.save(new Medicament(null, "solipred", 5, "20mg",500,o1));
        medicamentRepository.save(new Medicament(null, "donicort", 15, "64mg",650,o1));

        medicamentRepository.save(new Medicament(null, "augmentin", 7, "1000mg",800,o2));
        medicamentRepository.save(new Medicament(null, "Ebasta", 30, "10mg",750,o2));
    }
}
