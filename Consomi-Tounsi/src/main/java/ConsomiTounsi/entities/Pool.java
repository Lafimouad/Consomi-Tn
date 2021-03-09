package ConsomiTounsi.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pool implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_pool;
	
	private double amount_pool;
	
	@ManyToOne
	User user;
	
	@OneToMany List<Event> event ; /*composition*/

}
