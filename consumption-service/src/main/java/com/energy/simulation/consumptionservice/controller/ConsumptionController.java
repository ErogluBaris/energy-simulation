package com.energy.simulation.consumptionservice.controller;

import com.energy.simulation.consumptionservice.dto.ConsumptionDto;
import com.energy.simulation.consumptionservice.service.ConsumptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/home")
@RestController
public class ConsumptionController {

    private final ConsumptionService service;

    @PostMapping("/save")
    public ConsumptionDto save(@RequestBody ConsumptionDto consumptionDto) {
        return service.save(consumptionDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ConsumptionDto consumptionDto) {
        service.delete(consumptionDto);
    }

    @GetMapping("/{id}")
    public ConsumptionDto findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
