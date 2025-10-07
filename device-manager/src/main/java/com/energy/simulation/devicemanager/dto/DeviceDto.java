package com.energy.simulation.devicemanager.dto;

import com.energy.simulation.devicemanager.enums.ConsumptionClass;
import com.energy.simulation.devicemanager.enums.DeviceType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeviceDto {

    private Long id;
    private Long version;
    private String name;
    private DeviceType type;
    private Integer consumption;
    private ConsumptionClass consumptionClass;
    private Integer consumptionClassifierValue;
    private Long homeId;
}
