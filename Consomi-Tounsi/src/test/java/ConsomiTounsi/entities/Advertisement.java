package ConsomiTounsi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Advertisement implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id_advertisment;
	
	private String name_advertisement;
	
	@Temporal (TemporalType.DATE)
	private Date date_advertisment;
	@Temporal (TemporalType.DATE)
	private Date enddate_advertisement;
	private int finalviews_advertisement;
	private int targetviews_advertisement;
	@Enumerated(EnumType.STRING)
	private TypeAdvertisement type_advertisement;
	private double cost_advertisement;
	private String channel_advertisement;
	
	

}
