package org.dgdev.gestionpatient.model.mappers;

import org.dgdev.gestionpatient.model.dto.PatientDetailsDto;
import org.dgdev.gestionpatient.model.dto.PatientDto;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PatientDetailsMapper {
    @InheritInverseConfiguration
    Patient toPatient(PatientDetailsDto dto);
    @Mapping(source = "idPatient", target ="id"  )
    PatientDetailsDto toDto(Patient entity);
}

