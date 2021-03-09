package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Shelf implements Serializable {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_shelf;
	
	@Enumerated(EnumType.STRING)
    private typeShelf type_shelf;
	
	@ManyToOne
	Store store;
	
	@ManyToMany(mappedBy="association2", cascade = CascadeType.ALL)
	private Set<Product> product;
	
	
	
}
