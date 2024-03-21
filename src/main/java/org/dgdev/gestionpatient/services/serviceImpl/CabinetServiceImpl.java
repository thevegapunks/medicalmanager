package org.dgdev.gestionpatient.services.serviceImpl;


import org.dgdev.gestionpatient.model.dto.CabinetDto;
import org.dgdev.gestionpatient.model.entities.Cabinet;
import org.dgdev.gestionpatient.model.mappers.CabinetMapper;
import org.dgdev.gestionpatient.repositories.CabinetRepository;
import org.dgdev.gestionpatient.services.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {
    private final CabinetRepository cabinetRepository;
    @Autowired
    private CabinetMapper cabinetMapper;
    @Autowired
    public CabinetServiceImpl(CabinetRepository cabinetRepository) {
        this.cabinetRepository = cabinetRepository;
    }
    @Override
    public Cabinet saveCabinet(Cabinet cabinet) {
        return cabinetRepository.save(cabinet);
    }
    @Override
    public Cabinet findCabinetById(Long idCabinet) {
        Cabinet cabinet = this.cabinetRepository.findById(idCabinet).get();
        return cabinet;
    }
    @Override
    public CabinetDto findCabinetByCabinetNumber(String cabinetNumber) {
        Cabinet cabinet = this.cabinetRepository.findByCabinetNumber(cabinetNumber);
        return this.cabinetMapper.toDto(cabinet);
    }

    @Override
    public List<Cabinet> getAllCabinets() {
        return cabinetRepository.findAll();
    }
    @Override
    public void deleteCabinetById(Long idCabinet) {
        cabinetRepository.deleteById(idCabinet);
    }
}
