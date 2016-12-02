package kr.ac.hansung.model;

public class Subject {

	private int year;
	private int grade;
	private String code;
	private String name;
	private String division;
	private int score;

	public Subject() {
		super();
	}

	public Subject(int year, int grade, String code, String name, String division, int score) {
		super();
		this.year = year;
		this.grade = grade;
		this.code = code;
		this.name = name;
		this.division = division;
		this.score = score;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "subject [year=" + year + ", grade=" + grade + ", code=" + code + ", name=" + name + ", division="
				+ division + ", score=" + score + "]";
	}
	

}
