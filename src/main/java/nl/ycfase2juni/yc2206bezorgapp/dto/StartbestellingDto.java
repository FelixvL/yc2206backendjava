package nl.ycfase2juni.yc2206bezorgapp.dto;

public class StartbestellingDto {

	private long klantId;
	
	private long maaltijdId;
	
	private String opmerking;
	
	private long bezorgerId;

	public long getKlantId() {
		return klantId;
	}

	public void setKlantId(long klantId) {
		this.klantId = klantId;
	}

	public long getMaaltijdId() {
		return maaltijdId;
	}

	public void setMaaltijdId(long maaltijdId) {
		this.maaltijdId = maaltijdId;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}
	
	public long getBezorgerId() {
		return bezorgerId;
	}
	
	public void setBezorgerId(long bezorgerId) {
		this.bezorgerId = bezorgerId;
	}


}
