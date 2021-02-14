package soccer.com.example.dto;

public class Assists {
	private Integer from;
	private Integer to;
	public Assists(Integer from, Integer to) {
		super();
		this.from = from;
		this.to = to;
	}
	public Assists() {
		super();
	}
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
