package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="\"Order\"")

public class Order implements Serializable {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_order;
	@Temporal (TemporalType.DATE)
	private Date date_order;
	
	@Enumerated(EnumType.STRING)
	private Payment paymentType_order;
	
	private float cost_order;
	private boolean paid_order;
	private float weight_order;
	
	@ManyToOne
	Delivery delivery;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Product> association1;

}
