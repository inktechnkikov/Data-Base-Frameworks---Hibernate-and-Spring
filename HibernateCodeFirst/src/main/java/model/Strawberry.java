package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@DiscriminatorValue(value = "Fruit")
public class Strawberry extends BasicIngredient {
    private static final String NAME = "Strawberries";
    private static final BigDecimal PRICE = BigDecimal.valueOf(0.30);
    public Strawberry(){
        super(NAME,PRICE);
    }

}
