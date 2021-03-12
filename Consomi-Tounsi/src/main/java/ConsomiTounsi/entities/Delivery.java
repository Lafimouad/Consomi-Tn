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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Delivery implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_delivery;
	
	@Temporal (TemporalType.DATE)
	private Date date_delivery;
	
	private String destination_delivery;
	
	@Enumerated(EnumType.STRING)
	private MeansOfTransport meanOfTransport_delivery;
	private double cost_delivery;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
	private Set<Order> order;

}
