package com.energy.simulation.devicemanager.mapper;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionDto;
import com.energy.simulation.devicemanager.entity.DeviceConsumption;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeviceConsumptionMapper {

    DeviceConsumptionDto toDto(DeviceConsumption deviceConsumption);

    DeviceConsumption toEntity(DeviceConsumptionDto dto);

    List<DeviceConsumptionDto> toDtoList(List<DeviceConsumption> deviceConsumption);

    List<DeviceConsumption> toEntityList(List<DeviceConsumptionDto> dto);
}
