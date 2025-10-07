package com.energy.simulation.consumptionservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "consumption")
@Entity
public class Consumption {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @Column(name = "consumption")
    private Integer consumption;

    @Column(name = "name")
    private String name;

    @Column(name = "home_id")
    private Long homeId;

    //TODO aklıma gelen burada hesaplanan enerji tüketimini kaydetmek oldu ama, daha güzel bir veri tutulabilir aslında,
    // device tarafında hangi saatler cihazların çalıştığı tutulursa, hangi saat' lerde enerji tüketiminin olduğu vs çıkarılabilir
    // burada yine önemli olan haftalık, aylık, yıllık grafikler oluşturmak olacaktır.
}
