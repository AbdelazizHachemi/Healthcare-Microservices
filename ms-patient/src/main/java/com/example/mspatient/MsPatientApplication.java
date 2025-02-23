package com.example.mspatient;

import com.example.mspatient.Entities.Anticedent;
import com.example.mspatient.Entities.Patient;
import com.example.mspatient.Repository.AnticedentRepository;
import com.example.mspatient.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class MsPatientApplication implements CommandLineRunner {

    final PatientRepository patientRepository;
    final AnticedentRepository anticedentRepository;

    final RepositoryRestConfiguration config;

    public static void main(String[] args) {
        SpringApplication.run(MsPatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        config.exposeIdsFor(Patient.class);

        Patient p1=patientRepository.save(new Patient(null, "said", null));
        Patient p2=patientRepository.save(new Patient(null, "karim", null));

        anticedentRepository.save(new Anticedent(null,"Asthm",new Date(),p1));
        anticedentRepository.save(new Anticedent(null,"Diabete",new Date(),p1));

        anticedentRepository.save(new Anticedent(null,"grippe",new Date(),p2));
    }
}
