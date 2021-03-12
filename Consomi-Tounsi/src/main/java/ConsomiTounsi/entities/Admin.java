package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Admin extends User implements Serializable {

	@Enumerated(EnumType.STRING)
	private Role role_admin;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="admin")
	private Set<Advertisement> advertisement;
	
	@ManyToOne
	Message message;

}
