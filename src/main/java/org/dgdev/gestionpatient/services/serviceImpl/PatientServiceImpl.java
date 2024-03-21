package org.dgdev.gestionpatient.services.serviceImpl;

import org.dgdev.gestionpatient.model.dto.PatientDetailsDto;
import org.dgdev.gestionpatient.model.dto.PatientDto;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.dgdev.gestionpatient.model.mappers.PatientDetailsMapper;
import org.dgdev.gestionpatient.model.mappers.PatientMapper;
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
    private PatientMapper patientMapper;
    @Autowired
    private PatientDetailsMapper patientDetailsMapper;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public PatientDto findPatientById(Long id) {
        Patient patient = this.patientRepository.findById(id).get();
        return this.patientMapper.toDto(patient);
    }
    @Override
    public PatientDetailsDto findPatientDetailsById(Long id) {
        Patient patient = this.patientRepository.findById(id).get();
        return this.patientDetailsMapper.toDto(patient);
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
