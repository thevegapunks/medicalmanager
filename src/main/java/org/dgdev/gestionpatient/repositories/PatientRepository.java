package org.dgdev.gestionpatient.repositories;

import org.dgdev.gestionpatient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Optional<Patient> findByCin(String cin);
}
