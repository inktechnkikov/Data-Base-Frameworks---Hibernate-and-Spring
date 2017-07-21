package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@DiscriminatorValue(value = "Herbal")
public class Mint extends BasicIngredient {
    private static final String NAME = "Mint";
    private static final BigDecimal PRICE =BigDecimal.valueOf(0.45);

    public Mint(){
        super(NAME,PRICE);
    }
}
