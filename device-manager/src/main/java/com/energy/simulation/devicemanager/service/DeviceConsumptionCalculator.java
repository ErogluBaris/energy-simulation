package com.energy.simulation.devicemanager.service;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionCalculation;
import com.energy.simulation.devicemanager.dto.DeviceConsumptionDto;
import com.energy.simulation.devicemanager.dto.DeviceDto;
import com.energy.simulation.devicemanager.util.CalculationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Component
public class DeviceConsumptionCalculator {

    private final DeviceConsumptionService deviceConsumptionService;

    public DeviceConsumptionCalculation calculateDeviceConsumption(DeviceDto deviceDto) {
        List<DeviceConsumptionDto> deviceConsumptionList =
                deviceConsumptionService.findAllByDeviceTypeAndClassifierValue(deviceDto.getType(), deviceDto.getConsumptionClassifierValue());

        if (deviceConsumptionList.isEmpty()) {
            throw new RuntimeException("No device consumption found for device type " + deviceDto.getType());
        }

        DeviceConsumptionDto dto = deviceConsumptionList.getFirst();

        BigDecimal maxConsumption = CalculationUtil.calculateConsumptionByHour(dto.getConsumptionReferenceMaxValue(), dto.getConsumptionEEIRate());
        BigDecimal minConsumption = CalculationUtil.calculateConsumptionByHour(dto.getConsumptionReferenceMinValue(), dto.getConsumptionEEIRate());

        return DeviceConsumptionCalculation.builder()
                .maxConsumption(maxConsumption)
                .minConsumption(minConsumption)
                .avgConsumption(CalculationUtil.calculateAvg(maxConsumption, minConsumption))
                .build();
    }


}
