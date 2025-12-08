package com.energy.simulation.devicemanager.util;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

@UtilityClass
public class CalculationUtil {

    private static final int SCALE = 4;
    private static final RoundingMode ROUNDING = RoundingMode.HALF_UP;

    public static BigDecimal calculateConsumptionByHour(Integer limitValue, Double consumptionEEIRate) {
        return BigDecimal.valueOf(limitValue)
                .multiply(BigDecimal.valueOf(consumptionEEIRate))
                .setScale(SCALE, ROUNDING);
    }

    public static BigDecimal calculateAvg(BigDecimal first, BigDecimal second) {
        return first.add(second).divide(BigDecimal.TWO, SCALE, ROUNDING);
    }
}
