package model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name = "Fruits")
@PrimaryKeyJoinColumn(name = "id")
public class Strawberry extends BasicIngredient {
    private static final String NAME = "Strawberries";
    private static final BigDecimal PRICE = BigDecimal.valueOf(0.30);
    public Strawberry(){
        super(NAME,PRICE);
    }

}
