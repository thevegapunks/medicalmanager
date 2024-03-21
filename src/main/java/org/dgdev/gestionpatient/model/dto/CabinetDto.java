package org.dgdev.gestionpatient.model.dto;


import org.dgdev.gestionpatient.enums.CabinetMedicalSpeciality;

//Get Cabinet without patient informations
public record CabinetDto(Long idCabinet, String cabinetNumber, String name, CabinetMedicalSpeciality cabinetMedicalSpeciality, String address, String email, String phone) {

}
