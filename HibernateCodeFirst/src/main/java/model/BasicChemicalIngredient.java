package model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Chemical_ingredients")
@PrimaryKeyJoinColumn(name = "id")
public abstract class BasicChemicalIngredient extends BasicIngredient {
    @Column(name = "chemical_formula")
    @Basic
    private String chemicalFormula;

    public BasicChemicalIngredient() {
    }

    public BasicChemicalIngredient(String name, BigDecimal price, String chemicalFormula) {
        super(name, price);
        this.chemicalFormula = chemicalFormula;
    }

    public String getChemicalFormula() {
        return this.chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }
}
