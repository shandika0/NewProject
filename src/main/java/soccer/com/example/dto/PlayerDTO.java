package soccer.com.example.dto;

public class PlayerDTO {
    private String name;

    private String nationality;

    private Integer age;
    
    private Integer goals;
    
    private Integer assists;
    

	public PlayerDTO() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getGoals() {
		return goals;
	}


	public void setGoals(Integer goals) {
		this.goals = goals;
	}


	public Integer getAssists() {
		return assists;
	}


	public void setAssists(Integer assists) {
		this.assists = assists;
	}


	@Override
    public String toString() {
        return "Player{" +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age='" + age + '\'' +
                ", goals='" + goals + '\'' +
                ", assists='" + assists + '\'' +
                '}';
    }
	

}