package com.energy.simulation.homemanager.mapper;

import com.energy.simulation.homemanager.dto.HomeDto;
import com.energy.simulation.homemanager.entity.Home;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface HomeMapper {

    Home toEntity(HomeDto dto);

    HomeDto toDto(Home entity);
}
