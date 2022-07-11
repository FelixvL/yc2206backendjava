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
	private String fotoimage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFotoimage() {
		return fotoimage;
	}

	public void setFotoimage(String fotoimage) {
		this.fotoimage = fotoimage;
	}

	
}
