package com.energy.simulation.devicemanager.repository;

import com.energy.simulation.devicemanager.entity.DeviceConsumption;
import com.energy.simulation.devicemanager.enums.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceConsumptionRepository extends JpaRepository<DeviceConsumption, Long> {

    List<DeviceConsumption> findAllByDeviceTypeAndConsumptionClassifierValue(DeviceType deviceType, Integer classifierValue);
}
