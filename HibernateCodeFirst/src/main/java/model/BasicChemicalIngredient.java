package model;

import javax.persistence.Column;

public abstract class BasicChemicalIngredient extends BasicGradient{
    @Column(name = "chemical_formula")
    private String chemicalFormula;
    public BasicChemicalIngredient(String chemicalFormula){
        this.chemicalFormula = chemicalFormula;
    }

    public String getChemicalFormula() {
        return this.chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }
}
