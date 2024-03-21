package org.dgdev.gestionpatient.services;

import org.dgdev.gestionpatient.model.dto.CabinetDto;
import org.dgdev.gestionpatient.model.entities.Cabinet;


import java.util.List;

public interface CabinetService {
    Cabinet saveCabinet (Cabinet cabinet);
    Cabinet findCabinetById (Long idCabinet);
    CabinetDto findCabinetByCabinetNumber (String cabinetNumber);
    List<Cabinet> getAllCabinets();
    void deleteCabinetById(Long idCabinet);
}
