package org.dgdev.gestionpatient.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.dgdev.gestionpatient.enums.CabinetSpeciality;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCabinet;
    @ManyToOne
    private Patient patient;
    private String cabinetNumber;
    private String name;
    @Enumerated(EnumType.STRING)
    private CabinetSpeciality cabinetSpeciality;
    private String address;
    private String email;
    private String phone;
}
