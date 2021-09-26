package com.nixsolutions.entyty;

import java.math.BigDecimal;

public class PlanetTwo extends BaseEntyty{


    private BigDecimal weight = BigDecimal.valueOf(7.97E5);
    private BigDecimal radius = BigDecimal.valueOf(271E3);

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getRadius() {
        return radius;
    }
}
