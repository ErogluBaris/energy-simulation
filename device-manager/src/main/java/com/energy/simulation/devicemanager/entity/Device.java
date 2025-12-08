package com.energy.simulation.devicemanager.entity;

import com.energy.simulation.devicemanager.enums.ConsumptionClass;
import com.energy.simulation.devicemanager.enums.DeviceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "device")
@Entity
public class Device {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private DeviceType type;

    @Column(name = "consumption")
    private Integer consumption;

    @Column(name = "consumption_class")
    private ConsumptionClass consumptionClass;

    @Column(name = "consumption_classifier_value")
    private Integer consumptionClassifierValue;

    @Column(name = "operate_duration")
    private Long operateDuration;

    @Column(name = "home_id")
    private Long homeId;
}
