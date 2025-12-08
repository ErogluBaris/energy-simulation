package com.energy.simulation.homemanager.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class HomeEnergyService {

    public BigDecimal calculateConsumption(Long homeId) {
        //TODO burada diğer servisten device' ler için enerji tüketim bilgileri alınmalı, daha sonra o bilgiler burada kullanılabilir, sonra da billing-service çalışarak ne kadar para harcadığı çıkarılabilir.
    }
}
