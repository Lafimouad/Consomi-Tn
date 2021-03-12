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
public class Store implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_store;
	private String name_store;
	private String address_store;
	private boolean open_store;
	private double gain_store;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="store")
	private Set<Shelf> shelf;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="store")
	private Set<User> user;
}
