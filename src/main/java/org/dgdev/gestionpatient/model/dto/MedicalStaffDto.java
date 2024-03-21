package org.dgdev.gestionpatient.model.dto;

import org.dgdev.gestionpatient.enums.StaffRole;


public record MedicalStaffDto(Long id, String firstName, String lastName, String cin, StaffRole staffRole) {

}
