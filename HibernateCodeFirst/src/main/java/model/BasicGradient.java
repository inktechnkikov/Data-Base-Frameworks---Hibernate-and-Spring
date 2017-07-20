package model;
import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "ingredients")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ingredient_Type")
public abstract class BasicGradient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String name;
    @Basic
    private BigDecimal price;

    public BasicGradient(){
    }
    public BasicGradient(String name,BigDecimal price){
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
}
