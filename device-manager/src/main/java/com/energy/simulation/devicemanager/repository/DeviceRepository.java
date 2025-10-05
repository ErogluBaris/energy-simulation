package com.energy.simulation.devicemanager.repository;

import com.energy.simulation.devicemanager.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
