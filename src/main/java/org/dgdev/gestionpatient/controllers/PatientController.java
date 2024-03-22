package org.dgdev.gestionpatient.controllers;

import jakarta.persistence.PostUpdate;
import org.dgdev.gestionpatient.model.dto.PatientDetailsDto;
import org.dgdev.gestionpatient.model.dto.PatientDto;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.dgdev.gestionpatient.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;
    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @PostUpdate
    public Patient updatePatient(@RequestBody Patient Updatepatient) {
        return patientService.updatePatient(Updatepatient);
    }

    @GetMapping("/{id}")
    public PatientDto findPatientById(@PathVariable Long id) {
        return patientService.findPatientById(id);
    }
    @GetMapping("/findPatientDetailstById/{id}")
    public PatientDetailsDto findPatientDetailstById(@PathVariable Long id) {
        return patientService.findPatientDetailsById(id);
    }

    @GetMapping("/getPatientByCin/{cin}")
    public Optional<Patient> findPatientByCin(@PathVariable String cin) {
        return patientService.findPatientByCin(cin);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @DeleteMapping("deletePatientById/{id}")
    public void deletePatientById(@PathVariable Long id) {
                patientService.deletePatientById(id);
    }
}
