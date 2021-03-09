package ConsomiTounsi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;


@Entity

public class Claim implements Serializable {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_claim;
	
	private String decision_claim;
	
	@Temporal (TemporalType.DATE)
	private Date date_claim;
	
	@Temporal (TemporalType.DATE)
	private Date datefinal_claim;
	
	private String subject_claim;
	
	@ManyToOne
	User user;
	
}
