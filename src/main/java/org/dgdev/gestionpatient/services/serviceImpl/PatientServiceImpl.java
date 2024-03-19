package org.dgdev.gestionpatient.services.serviceImpl;

import org.dgdev.gestionpatient.entities.Patient;
import org.dgdev.gestionpatient.repositories.PatientRepository;
import org.dgdev.gestionpatient.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;
    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> findPatientById(Long id) {
         return patientRepository.findById(id);
    }

    @Override
    public Optional<Patient> findPatientByCin(String cin) {
        return patientRepository.findByCin(cin);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public void deletePatientById(Long id) {
                patientRepository.deleteById(id);
    }
}
