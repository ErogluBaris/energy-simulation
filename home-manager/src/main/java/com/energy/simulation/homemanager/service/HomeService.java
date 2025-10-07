package com.energy.simulation.homemanager.service;

import com.energy.simulation.homemanager.dto.HomeDto;
import com.energy.simulation.homemanager.mapper.HomeMapper;
import com.energy.simulation.homemanager.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HomeService {

    private final HomeRepository repository;
    private final HomeMapper mapper;

    public HomeDto save(HomeDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public HomeDto findById(Long id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    public void delete(HomeDto dto) {
        if (dto.getId() == null) {
            throw new RuntimeException("Id is null");
        }
        repository.deleteById(dto.getId());
    }
}
