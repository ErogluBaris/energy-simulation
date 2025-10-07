package com.energy.simulation.consumptionservice.service;

import com.energy.simulation.consumptionservice.dto.ConsumptionDto;
import com.energy.simulation.consumptionservice.mapper.ConsumptionMapper;
import com.energy.simulation.consumptionservice.repository.ConsumptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConsumptionService {

    private final ConsumptionRepository repository;
    private final ConsumptionMapper mapper;

    public ConsumptionDto save(ConsumptionDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public ConsumptionDto findById(Long id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    public void delete(ConsumptionDto dto) {
        if (dto.getId() == null) {
            throw new RuntimeException("Id is null");
        }
        repository.deleteById(dto.getId());
    }
}
