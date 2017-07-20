package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@DiscriminatorValue(value = "Straws")
public class Strawberry extends BasicGradient {
    public Strawberry(){
        super("Strawberry",BigDecimal.valueOf(0.30));
    }

}
