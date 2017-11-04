package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "production_batch")
public class ProductionBatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "batch")
    private Set<BasicShampoos> shampoosSet;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<BasicShampoos> getShampoosSet() {
        return this.shampoosSet;
    }

    public void setShampoosSet(Set<BasicShampoos> shampoosSet) {
        this.shampoosSet = shampoosSet;
    }
}
