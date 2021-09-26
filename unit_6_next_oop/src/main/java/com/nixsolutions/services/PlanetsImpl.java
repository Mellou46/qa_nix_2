package com.nixsolutions.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanetsImpl implements Planets{

    public BigDecimal res = BigDecimal.valueOf(6.67E-11);

    @Override
    public BigDecimal getAcceleration(BigDecimal radius, BigDecimal weight) {
        return res.multiply(weight.divide(radius.pow(2), 2, RoundingMode.HALF_EVEN));
    }
}
