package model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Am_Chloride")
@PrimaryKeyJoinColumn(name = "id")
public class AmonuimChloride extends BasicChemicalIngredient{
    private static final String NAME = "Ammonium Chloride";
    private static final BigDecimal PRICE = BigDecimal.valueOf(1.20);
    private static final String FORMULA = "NH4CL";

    public AmonuimChloride() {
        super(NAME,PRICE,FORMULA);
    }
}
