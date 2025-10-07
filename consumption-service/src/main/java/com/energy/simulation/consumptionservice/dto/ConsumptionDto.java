package com.energy.simulation.consumptionservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConsumptionDto {

    private Long id;
    private Integer version;
    private String name;
    private Integer consumption;
    private Long homeId;
}
