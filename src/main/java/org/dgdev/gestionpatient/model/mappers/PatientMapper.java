package org.dgdev.gestionpatient.model.mappers;

import org.dgdev.gestionpatient.model.dto.PatientDto;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    @InheritInverseConfiguration
    Patient toPatient(PatientDto dto);
    @Mapping(source = "idPatient", target ="id"  )
    PatientDto toDto(Patient entity);



}
