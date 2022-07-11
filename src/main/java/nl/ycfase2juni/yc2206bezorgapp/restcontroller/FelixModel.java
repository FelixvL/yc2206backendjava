package nl.ycfase2juni.yc2206bezorgapp.restcontroller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FelixModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 100000)
	private byte[] fotoimage;

}
