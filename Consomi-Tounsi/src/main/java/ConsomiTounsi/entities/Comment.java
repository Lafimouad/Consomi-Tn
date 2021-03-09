package ConsomiTounsi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Comment implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_comment;
	
	private int likes_comment;
	private boolean prohibitedDict_comment;
	private boolean mostPertinat_comment;
	
	@ManyToOne
    Subject subject;
	
	

}
