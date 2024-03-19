package org.dgdev.gestionpatient.mappers;

import org.dgdev.gestionpatient.dto.PatientDto;
import org.dgdev.gestionpatient.entities.Patient;
import org.mapstruct.Mapper;

@Mapper
public interface PatientMapper {
    PatientDto toPatientDto(Patient patient);
}
