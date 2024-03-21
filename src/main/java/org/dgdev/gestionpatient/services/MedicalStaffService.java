package org.dgdev.gestionpatient.services;


import org.dgdev.gestionpatient.model.dto.MedicalStaffDto;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;

import java.util.List;

public interface MedicalStaffService {
    MedicalStaff saveMedicalStaff (MedicalStaff medicalStaff);
    List<MedicalStaff> getAllMedicalStaffs();
    MedicalStaffDto findMedicalStaffByCin (String cin);
    void deleteMedicalStaffById(Long id);
}
