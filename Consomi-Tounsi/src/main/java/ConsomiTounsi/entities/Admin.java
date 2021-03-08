package ConsomiTounsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
public class Admin extends User implements Serializable {

	@Enumerated(EnumType.STRING)
	private Role role_admin;
	
}
