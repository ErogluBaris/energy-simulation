package com.energy.simulation.devicemanager.dto;

import com.energy.simulation.devicemanager.enums.DeviceType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeviceConsumptionDto {

    private Long id;
    private Long version;
    private DeviceType type;
    private Integer consumptionClassifierValue;
    private Integer consumptionReferenceValue;
}
