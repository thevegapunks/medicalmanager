package org.dgdev.gestionpatient.model.mappers;

import org.dgdev.gestionpatient.model.dto.CabinetDto;
import org.dgdev.gestionpatient.model.entities.Cabinet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CabinetMapper {
    @InheritInverseConfiguration
    Cabinet toCabinet(CabinetDto dto);
    @Mapping(source = "idCabinet", target ="idCabinet"  )
    CabinetDto toDto(Cabinet entity);
}
