package org.dgdev.gestionpatient.controllers;

import org.dgdev.gestionpatient.entities.Patient;
import org.dgdev.gestionpatient.services.PatientService;
import org.dgdev.gestionpatient.services.serviceImpl.PatientServiceImpl;
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

    @GetMapping("/{id}")
    public Optional<Patient> findPatientById(@PathVariable Long id) {
        return patientService.findPatientById(id);
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
