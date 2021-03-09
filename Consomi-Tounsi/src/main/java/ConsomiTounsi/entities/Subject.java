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
public class Subject implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_subject;
	
	private boolean redendant_subject;
	private boolean featured_subject;
	private String description_subject;
	private int likes_subject;
	@ManyToOne
	User user;
	
	@OneToMany List<Comment> comment ;
	

}
