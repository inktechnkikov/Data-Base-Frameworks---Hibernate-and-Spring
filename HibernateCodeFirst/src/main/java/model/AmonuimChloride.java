package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AMCHL")
public class AmonuimChloride extends BasicChemicalIngredient{
    public AmonuimChloride() {
        super("NH4CL");
    }
}
