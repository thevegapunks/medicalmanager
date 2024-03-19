package org.dgdev.gestionpatient.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.dgdev.gestionpatient.entities.Patient;
import org.dgdev.gestionpatient.enums.FamilySituation;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String cin;
    private String insuranceNumber;
    private LocalDate dateOfBirth;
    private String address;
    private String email;
    private String phone;
    private FamilySituation familySituation;


    public static PatientDto toPatientDto(Patient patient){
        return null;
    }
}
