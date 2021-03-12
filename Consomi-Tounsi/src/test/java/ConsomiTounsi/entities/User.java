package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_user;
	private String username_user;
	private String password_user;
	private String phoneNumber_user;
	private String emailAddress_user;
	@Temporal (TemporalType.DATE)
	private Date dateBirth_user;
	private String address_user;

}
