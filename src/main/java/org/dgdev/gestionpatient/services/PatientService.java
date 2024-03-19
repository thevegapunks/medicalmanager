package org.dgdev.gestionpatient.services;

import org.dgdev.gestionpatient.entities.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Patient savePatient(Patient patient);
    Optional<Patient> findPatientById(Long id);
    Optional<Patient> findPatientByCin(String cin);
    List<Patient> getAllPatients();
    void deletePatientById(Long id);

}
