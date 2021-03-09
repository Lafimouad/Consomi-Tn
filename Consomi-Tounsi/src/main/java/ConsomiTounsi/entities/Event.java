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
public class Event implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_event;
	
	private double raisedAmount_event;
	private String place_event;
	private String target_event;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="event")
	private Set<Donation> donation;

}
