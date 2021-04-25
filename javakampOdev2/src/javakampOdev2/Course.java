package javakampOdev2;

public class Course {
	
	public Course () {
		System.out.println("Course class'ý çalýþtý");
	}
	
	
	public Course (int id,String courseName, String instructor, int percent)  {
		
		this();
		this.id=id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.percent = percent;
		
	}
	
	
	int id;
	String courseName;
	String instructor;
	int percent;
}
