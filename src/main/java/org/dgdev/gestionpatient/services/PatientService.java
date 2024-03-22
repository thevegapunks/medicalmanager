package org.dgdev.gestionpatient.services;

import org.dgdev.gestionpatient.model.dto.PatientDetailsDto;
import org.dgdev.gestionpatient.model.dto.PatientDto;
import org.dgdev.gestionpatient.model.entities.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Patient savePatient(Patient patient);
    Patient updatePatient(Patient Updatepatient);
    PatientDto findPatientById(Long id);
    PatientDetailsDto findPatientDetailsById(Long id);
    Optional<Patient> findPatientByCin(String cin);
    List<Patient> getAllPatients();
    void deletePatientById(Long id);

}
