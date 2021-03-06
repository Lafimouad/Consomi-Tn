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
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_product;
	
	private int quantity_product;
	private String code_product;
	private int rating_product;
	private String name_product;
	private String category_product;
	private double price_product;
	private String shelf_product;
	private boolean available_product;
	private String description_product;
	private double weight_product;
	@ManyToOne
	Supplier supplier;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="product")
	private Set<Feedback> feedback;
	
	@ManyToMany(mappedBy="association1", cascade = CascadeType.ALL)
	private Set<Order> order;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Shelf> association2;
	

}
