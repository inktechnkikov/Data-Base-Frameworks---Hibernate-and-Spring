package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue(value = "Chemical Element")
public class AmonuimChloride extends BasicChemicalIngredient{
    private static final String NAME = "Ammonium Chloride";
    private static final BigDecimal PRICE = BigDecimal.valueOf(1.20);
    private static final String FORMULA = "NH4CL";

    public AmonuimChloride() {
        super(NAME,PRICE,FORMULA);
    }
}
