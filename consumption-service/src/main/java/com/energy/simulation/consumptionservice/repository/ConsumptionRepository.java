package com.energy.simulation.consumptionservice.repository;

import com.energy.simulation.consumptionservice.entity.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumptionRepository extends JpaRepository<Consumption, Long> {

}
