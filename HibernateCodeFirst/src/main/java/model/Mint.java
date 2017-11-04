package model;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name = "Herbals")
@PrimaryKeyJoinColumn(name = "id")
public class Mint extends BasicIngredient {
    private static final String NAME = "Mint";
    private static final BigDecimal PRICE =BigDecimal.valueOf(0.45);

    public Mint(){
        super(NAME,PRICE);
    }
}
