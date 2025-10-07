package com.energy.simulation.devicemanager.controller;

import com.energy.simulation.devicemanager.dto.DeviceDto;
import com.energy.simulation.devicemanager.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/device")
@RestController
public class DeviceController {

    private final DeviceService deviceService;

    @PostMapping("/add")
    public DeviceDto add(DeviceDto deviceDto) {
        return deviceService.save(deviceDto);
    }

    @DeleteMapping("/remove")
    public void remove(DeviceDto deviceDto) {
        deviceService.delete(deviceDto);
    }

    @PutMapping("/update")
    public DeviceDto update(DeviceDto deviceDto) {
        return deviceService.update(deviceDto);
    }

    @PostMapping("/add-list")
    public List<DeviceDto> addList(List<DeviceDto> deviceDtoList) {
        return deviceService.saveAll(deviceDtoList);
    }
}
