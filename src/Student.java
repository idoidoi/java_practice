
public class Student {
	public enum Sex{MALE,FEMALE}
	public enum City {Seoul,Pusan}
	public static int score (int num) {
		return num;
	}
	
	private String name;
	public Student() {
		super();
	}

	private int Score;
	private Sex sex;
	private City city;
	
	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.Score = score;
		this.sex = sex;
	}

	public Student(String name, int score, Student.Sex sex, Student.City city) {
		super();
		this.name = name;
		Score = score;
		this.sex = sex;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return Score;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}
	
}
