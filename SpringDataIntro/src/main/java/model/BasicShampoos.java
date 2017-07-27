package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "shampoos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class BasicShampoos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(optional = false,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "label_id")
    private ClassicLabel label;

    @ManyToOne(optional = false,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "batch_id")
    private ProductionBatch batch;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinTable(name = "shampoos_ingredients",joinColumns = @JoinColumn(name = "shampoo_id"),inverseJoinColumns =
    @JoinColumn(name = "ingredient_id"))
    private Set<BasicIngredient> ingredientSet;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public ClassicLabel getLabel() {
        return this.label;
    }

    public void setLabel(ClassicLabel label) {
        this.label = label;
    }
    public ProductionBatch getBatch(){
        return this.batch;
    }
    public void setBatch(ProductionBatch batch){
        this.batch = batch;
    }

    public Set<BasicIngredient> getIngredientSet() {
        return this.ingredientSet;
    }

    public void setIngredientSet(Set<BasicIngredient> ingredientSet) {
        this.ingredientSet = ingredientSet;
    }
}
