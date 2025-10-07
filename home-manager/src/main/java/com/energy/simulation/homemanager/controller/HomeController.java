package com.energy.simulation.homemanager.controller;

import com.energy.simulation.homemanager.dto.HomeDto;
import com.energy.simulation.homemanager.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/home")
@RestController
public class HomeController {

    private final HomeService homeService;

    @PostMapping("/save")
    public HomeDto save(@RequestBody HomeDto homeDto) {
        return homeService.save(homeDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody HomeDto homeDto) {
        homeService.delete(homeDto);
    }

    @GetMapping("/{id}")
    public HomeDto findById(@PathVariable Long id) {
        return homeService.findById(id);
    }
}
