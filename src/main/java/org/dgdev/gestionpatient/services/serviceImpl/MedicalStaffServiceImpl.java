package org.dgdev.gestionpatient.services.serviceImpl;



import org.dgdev.gestionpatient.model.dto.MedicalStaffDto;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.dgdev.gestionpatient.model.mappers.MedicalStaffMapper;
import org.dgdev.gestionpatient.repositories.MedicalStaffRepository;
import org.dgdev.gestionpatient.services.MedicalStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalStaffServiceImpl implements MedicalStaffService {
    private final MedicalStaffRepository medicalStaffRepository;
    @Autowired
    private MedicalStaffMapper medicalStaffMapper;
    @Autowired
    public MedicalStaffServiceImpl(MedicalStaffRepository medicalStaffRepository) {
        this.medicalStaffRepository = medicalStaffRepository;
    }
    @Override
    public MedicalStaff saveMedicalStaff(MedicalStaff medicalStaff) {
        return medicalStaffRepository.save(medicalStaff);
    }
    @Override
    public List<MedicalStaff> getAllMedicalStaffs() {
        return medicalStaffRepository.findAll();
    }
    @Override
    public MedicalStaffDto findMedicalStaffByCin(String cin) {
        MedicalStaff medicalStaff = this.medicalStaffRepository.findByCin(cin);
        return this.medicalStaffMapper.toDto(medicalStaff);
    }


    @Override
    public void deleteMedicalStaffById(Long id) { medicalStaffRepository.deleteById(id);}

}
