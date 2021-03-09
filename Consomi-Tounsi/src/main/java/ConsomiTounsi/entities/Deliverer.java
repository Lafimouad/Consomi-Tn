package ConsomiTounsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deliverer extends User implements Serializable {
	
	private boolean delivererOfTheMonth_deliverer;
	private boolean available_deliverer;
	private double distance_deliverer;
	private double bonnus_deliverer;
	
	
}
