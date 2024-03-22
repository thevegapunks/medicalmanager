package org.dgdev.gestionpatient.controllers;


import jakarta.persistence.PostUpdate;
import org.dgdev.gestionpatient.model.dto.CabinetDto;
import org.dgdev.gestionpatient.model.entities.Cabinet;
import org.dgdev.gestionpatient.model.entities.MedicalStaff;
import org.dgdev.gestionpatient.model.entities.Patient;
import org.dgdev.gestionpatient.services.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cabinets")
public class CabinetController {
    private final CabinetService cabinetService;
    @Autowired
    public CabinetController(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }
    @GetMapping("findCabinetByCabinetNumber/{cabinetNumber}")
    public CabinetDto findCabinetByCabinetNumber(@PathVariable String cabinetNumber) {
        return cabinetService.findCabinetByCabinetNumber(cabinetNumber);
    }
    @GetMapping
    public List<Cabinet> getAllCabinets() {
        return cabinetService.getAllCabinets();
    }
    @PostMapping
    public Cabinet saveCabinet(@RequestBody Cabinet cabinet) {
        return cabinetService.saveCabinet(cabinet);
    }

    @PostUpdate
    public Cabinet updateCabinet(@RequestBody Cabinet updateCabinet) {
        return cabinetService.updateCabinet(updateCabinet);
    }
    @DeleteMapping("deleteCabinetById/{idCabinet}")
    public void deleteCabinetById(@PathVariable Long idCabinet) {
        cabinetService.deleteCabinetById(idCabinet);
    }
}
