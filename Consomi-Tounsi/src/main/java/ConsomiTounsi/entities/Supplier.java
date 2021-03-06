package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_supplier;
	
	private String name_supplier;
	private String phoneNumber_supplier;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="supplier")
	private Set<Product> product;

}
