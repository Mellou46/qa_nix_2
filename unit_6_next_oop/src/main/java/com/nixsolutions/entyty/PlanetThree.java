package com.nixsolutions.entyty;

import java.math.BigDecimal;

public class PlanetThree extends BaseEntyty{


    private BigDecimal weight = BigDecimal.valueOf(1.97E24);
    private BigDecimal radius = BigDecimal.valueOf(611E3);

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getRadius() {
        return radius;
    }
}
