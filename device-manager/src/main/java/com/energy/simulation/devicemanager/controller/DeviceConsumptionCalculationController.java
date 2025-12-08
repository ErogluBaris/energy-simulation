package com.energy.simulation.devicemanager.controller;

import com.energy.simulation.devicemanager.dto.DeviceConsumptionCalculation;
import com.energy.simulation.devicemanager.service.DeviceConsumptionCalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/device-consumption-calculation")
@RestController
public class DeviceConsumptionCalculationController {

    private final DeviceConsumptionCalculationService service;

    @GetMapping("/calculate")
    public List<DeviceConsumptionCalculation> calculate(@RequestParam("homeId") Long homeId) {
        return service.calculate(homeId);
    }
}
