package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@DiscriminatorValue(value = "MT")
public class Mint extends BasicGradient {

    public Mint(){
        super("Mint",BigDecimal.valueOf(0.45));
    }

}
