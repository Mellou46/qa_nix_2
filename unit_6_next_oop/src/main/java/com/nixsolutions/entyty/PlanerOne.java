package com.nixsolutions.entyty;

import java.math.BigDecimal;

public class PlanerOne extends BaseEntyty{

    private BigDecimal weight = BigDecimal.valueOf(2.14E24);
    private BigDecimal radius = BigDecimal.valueOf(2971E3);

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getRadius() {
        return radius;
    }
}
