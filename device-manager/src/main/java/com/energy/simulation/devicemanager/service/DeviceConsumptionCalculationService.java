package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionCalculation;
import com.energy.simulation.devicemanager.dto.DeviceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class DeviceConsumptionCalculationService {

    private final DeviceService deviceService;
    private final DeviceConsumptionCalculator deviceConsumptionCalculator;

    public List<DeviceConsumptionCalculation> calculate(Long homeId) {
        List<DeviceDto> devices = deviceService.findAllByHomeId(homeId);

        List<DeviceConsumptionCalculation> deviceConsumptionCalculations = new ArrayList<>();
        for (DeviceDto device : devices) {
            deviceConsumptionCalculations.add(deviceConsumptionCalculator.calculateDeviceConsumption(device));
        }

        return deviceConsumptionCalculations.stream()
                .filter(Objects::nonNull)
                .toList();
    }
}
