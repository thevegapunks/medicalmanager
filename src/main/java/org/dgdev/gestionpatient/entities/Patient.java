package org.dgdev.gestionpatient.entities;

import jakarta.persistence.*;
import lombok.*;
import org.dgdev.gestionpatient.enums.FamilySituation;

import java.time.LocalDate;

@Entity
//bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
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
}
