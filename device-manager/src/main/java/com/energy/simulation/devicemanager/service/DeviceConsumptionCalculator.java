package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionDto;
import com.energy.simulation.devicemanager.enums.DeviceType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DeviceConsumptionCalculator {

    private final DeviceConsumptionService deviceConsumptionService;

    public void calculateDeviceConsumption(DeviceType deviceType, Integer consumptionClassifierValue) {
        List<DeviceConsumptionDto> deviceConsumptionList =
                deviceConsumptionService.findAllByDeviceTypeAndClassifierValue(deviceType, consumptionClassifierValue);

        DeviceConsumptionDto deviceConsumption = deviceConsumptionList.getFirst();



    }
}
