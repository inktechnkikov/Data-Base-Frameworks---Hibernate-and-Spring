package model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "ingredients")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BasicIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String name;
    @Basic
    private BigDecimal price;

    @ManyToMany(mappedBy = "ingredientSet")
    private Set<BasicShampoos> basicShampoosSet;


    public BasicIngredient(){
    }
    public BasicIngredient(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }
    public Long getId(){
        return this.id;
    }
    public void setId(){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
    public void setPrice(){
        this.price = price;
    }

    public Set<BasicShampoos> getBasicShampoosSet() {
        return this.basicShampoosSet;
    }

    public void setBasicShampoosSet(Set<BasicShampoos> basicShampoosSet) {
        this.basicShampoosSet = basicShampoosSet;
    }

}
