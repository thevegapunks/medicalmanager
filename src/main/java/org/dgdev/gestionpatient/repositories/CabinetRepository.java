package org.dgdev.gestionpatient.repositories;

import org.dgdev.gestionpatient.model.entities.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface CabinetRepository extends JpaRepository <Cabinet,Long> {
    Cabinet findByCabinetNumber(String cabinetNumber);
}
