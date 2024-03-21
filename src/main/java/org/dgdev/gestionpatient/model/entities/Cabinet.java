package org.dgdev.gestionpatient.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.dgdev.gestionpatient.enums.CabinetMedicalSpeciality;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCabinet;
    @ManyToMany
    private List<MedicalStaff> medicalStaffs;
    @ManyToMany
    private List<Patient> patients;
    private String cabinetNumber;
    private String name;
    @Enumerated(EnumType.STRING)
    private CabinetMedicalSpeciality cabinetMedicalSpeciality;
    private String address;
    private String email;
    private String phone;
}
