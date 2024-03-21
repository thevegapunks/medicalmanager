package org.dgdev.gestionpatient.repositories;

import org.dgdev.gestionpatient.model.dto.MedicalStaffDto;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface MedicalStaffRepository extends JpaRepository<MedicalStaff,Long> {
    MedicalStaff findByCin(String cin);
}
