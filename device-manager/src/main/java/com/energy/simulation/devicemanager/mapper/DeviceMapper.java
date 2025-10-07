package com.energy.simulation.devicemanager.mapper;

import com.energy.simulation.devicemanager.dto.DeviceDto;
import com.energy.simulation.devicemanager.entity.Device;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeviceMapper {

    DeviceDto toDto(Device device);

    Device toEntity(DeviceDto dto);

    List<DeviceDto> toDtoList(List<Device> deviceList);

    List<Device> toEntityList(List<DeviceDto> dtoList);

}
