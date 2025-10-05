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

    @Column(name = "consumption_reference_value")
    private Integer consumptionReferenceValue;
}
