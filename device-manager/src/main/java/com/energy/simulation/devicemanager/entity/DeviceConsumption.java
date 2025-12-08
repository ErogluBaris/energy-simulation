package com.energy.simulation.devicemanager.entity;

import com.energy.simulation.devicemanager.enums.DeviceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "device_consumption")
@Entity
public class DeviceConsumption {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @Column(name = "device_type")
    private DeviceType deviceType;

    @Column(name = "consumption_classifier_value")
    private Integer consumptionClassifierValue;

    @Column(name = "consumption_reference_max_value")
    private Integer consumptionReferenceMaxValue;

    @Column(name = "consumption_reference_min_value")
    private Integer consumptionReferenceMinValue;

    @Column(name = "consumption_EEI_rate")
    private Double consumptionEEIRate;
}
