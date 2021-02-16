package soccer.com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Nationality")
    private String nationality;

    @Column(name = "Age")
    private Integer age;
    
    @Column(name = "Goals")
    private Integer goals;
    
    @Column(name = "Assists")
    private Integer assists;


    public Entities(Long id, String name, String nationality, Integer age, Integer goals, Integer assists) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.goals = goals;
		this.assists = assists;
	}

	public Entities(){}
  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Integer getAssist() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	@Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age='" + age + '\'' +
                ", goals='" + goals + '\'' +
                ", assists='" + assists + '\'' +
                '}';
    }
}
