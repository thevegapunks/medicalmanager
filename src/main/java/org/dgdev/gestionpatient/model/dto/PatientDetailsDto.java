package org.dgdev.gestionpatient.model.dto;

public record PatientDetailsDto(Long id, String firstName , String lastName , String cin, String insuranceNumber) {
}
