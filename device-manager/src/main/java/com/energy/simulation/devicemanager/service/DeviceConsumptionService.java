package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionDto;
import com.energy.simulation.devicemanager.enums.DeviceType;
import com.energy.simulation.devicemanager.mapper.DeviceConsumptionMapper;
import com.energy.simulation.devicemanager.repository.DeviceConsumptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeviceConsumptionService {

    private final DeviceConsumptionRepository repository;
    private final DeviceConsumptionMapper mapper;

    public List<DeviceConsumptionDto> findAllByDeviceTypeAndClassifierValue(DeviceType deviceType, Integer classifierValue) {
        return mapper.toDtoList(repository.findAllByDeviceTypeAndConsumptionClassifierValue(deviceType, classifierValue));
    }
}
