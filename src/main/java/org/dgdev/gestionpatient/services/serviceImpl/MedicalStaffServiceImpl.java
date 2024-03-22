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
    public MedicalStaff updateMedicalStaff(MedicalStaff UpdateMedicalStaff) {
        MedicalStaff medicalStaff = medicalStaffRepository.findById(UpdateMedicalStaff.getId()).orElse(null);
        if (medicalStaff != null){
            medicalStaff.setStaffRole(UpdateMedicalStaff.getStaffRole());
            medicalStaff.setAddress(UpdateMedicalStaff.getAddress());
            medicalStaff.setCin(UpdateMedicalStaff.getCin());
            medicalStaff.setEmail(UpdateMedicalStaff.getEmail());
            medicalStaff.setPhone(UpdateMedicalStaff.getPhone());
            medicalStaff.setFirstName(UpdateMedicalStaff.getFirstName());
            medicalStaff.setLastName(UpdateMedicalStaff.getLastName());
            return medicalStaffRepository.save(medicalStaff);
        }
        return null;
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
