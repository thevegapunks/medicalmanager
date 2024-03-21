package org.dgdev.gestionpatient.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.dgdev.gestionpatient.enums.StaffRole;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String cin;
    private String address;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private StaffRole staffRole;

}
