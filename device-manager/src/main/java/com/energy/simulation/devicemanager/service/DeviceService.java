package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceDto;
import com.energy.simulation.devicemanager.mapper.DeviceMapper;
import com.energy.simulation.devicemanager.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DeviceService {

    private final DeviceRepository repository;
    private final DeviceMapper mapper;

    @Transactional
    public DeviceDto save(DeviceDto deviceDto) {
        return mapper.toDto(repository.save(mapper.toEntity(deviceDto)));
    }
}
