package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Fresh")
public class FreshShampoo extends BasicShampoos {

}
