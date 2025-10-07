package com.energy.simulation.consumptionservice.mapper;

import com.energy.simulation.consumptionservice.dto.ConsumptionDto;
import com.energy.simulation.consumptionservice.entity.Consumption;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ConsumptionMapper {

    Consumption toEntity(ConsumptionDto dto);

    ConsumptionDto toDto(Consumption entity);
}
