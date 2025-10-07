package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceDto;
import com.energy.simulation.devicemanager.mapper.DeviceMapper;
import com.energy.simulation.devicemanager.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeviceService {

    private final DeviceRepository repository;
    private final DeviceMapper mapper;

    @Transactional
    public DeviceDto save(DeviceDto deviceDto) {
        return mapper.toDto(repository.save(mapper.toEntity(deviceDto)));
    }

    @Transactional
    public void delete(DeviceDto deviceDto) {
        if (deviceDto == null) {
            throw new RuntimeException("Id is null!");
        }
        repository.deleteById(deviceDto.getId());
    }

    @Transactional
    public DeviceDto update(DeviceDto deviceDto) {
        if (deviceDto.getId() == null || deviceDto.getVersion() == null) {
            throw new RuntimeException("Id or version is null!");
        }
        return save(deviceDto);
    }

    @Transactional
    public List<DeviceDto> saveAll(List<DeviceDto> deviceDtoList) {
        return mapper.toDtoList(repository.saveAll(mapper.toEntityList(deviceDtoList)));
    }
}
