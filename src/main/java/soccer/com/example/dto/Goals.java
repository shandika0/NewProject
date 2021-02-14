package soccer.com.example.dto;

public class Goals {
	private Integer from;
	private Integer to;
	public Goals(Integer from, Integer to) {
		super();
		this.from = from;
		this.to = to;
	}
	public Goals() {}
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public Integer getTo() {
		return to;
	}
	public void setTo(Integer to) {
		this.to = to;
	}
	
	
	
}	
