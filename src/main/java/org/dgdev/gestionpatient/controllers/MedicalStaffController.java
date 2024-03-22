package org.dgdev.gestionpatient.controllers;


import jakarta.persistence.PostUpdate;
import org.dgdev.gestionpatient.model.dto.MedicalStaffDto;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.dgdev.gestionpatient.services.MedicalStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/MedicalStaffs")
public class MedicalStaffController {
    private final MedicalStaffService medicalStaffService;
    @Autowired
    public MedicalStaffController(MedicalStaffService medicalStaffService) {
        this.medicalStaffService = medicalStaffService;
    }
    @PostMapping
    public MedicalStaff saveMedicalStaff(@RequestBody MedicalStaff medicalStaff) {
        return medicalStaffService.saveMedicalStaff(medicalStaff);
    }
    @PostUpdate
    public MedicalStaff updateMedicalStaff(@RequestBody MedicalStaff updateMedicalStaff) {
        return medicalStaffService.updateMedicalStaff(updateMedicalStaff);
    }
    @GetMapping
    public List<MedicalStaff> getAllMedicalStaffs() {
        return medicalStaffService.getAllMedicalStaffs();
    }

    @GetMapping("findMedicalStaffByCin/{cin}")
    public MedicalStaffDto findMedicalStaffByCin(@PathVariable String cin) {
        return medicalStaffService.findMedicalStaffByCin(cin);
    }
    @DeleteMapping("deleteMedicalStaffById/{id}")
    public void deleteMedicalStaffById(@PathVariable Long id) {
        medicalStaffService.deleteMedicalStaffById(id);
    }
}
