package org.dgdev.gestionpatient.model.entities;

import jakarta.persistence.*;
import lombok.*;
import org.dgdev.gestionpatient.enums.FamilySituation;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String cin;
    private String insuranceNumber;
    private LocalDate dateOfBirth;
    private String address;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private FamilySituation familySituation;
}
