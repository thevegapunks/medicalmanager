package org.dgdev.gestionpatient.model.mappers;


import org.dgdev.gestionpatient.model.dto.MedicalStaffDto;
import org.dgdev.gestionpatient.model.entities.Cabinet;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MedicalStaffMapper {
    @InheritInverseConfiguration
    MedicalStaff toMedicalStaff(MedicalStaffDto dto);
    @Mapping(source = "id", target ="id")
    MedicalStaffDto toDto(MedicalStaff entity);
}
