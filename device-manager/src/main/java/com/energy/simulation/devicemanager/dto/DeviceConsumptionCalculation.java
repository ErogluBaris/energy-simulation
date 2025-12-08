package com.energy.simulation.devicemanager.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Setter
@Getter
public class DeviceConsumptionCalculation {

    private BigDecimal maxConsumption;
    private BigDecimal minConsumption;
    private BigDecimal avgConsumption;
}
