package javakampOdev2;



public class Main {

	public static void main(String[] args) {
	
		Course course1 = new Course (1,"Programlamaya Giriþ","Engin",0);
		
		Course course2 = new Course();
		course2.id= 2;
		course2.courseName = "C# + Angular";
		course2.instructor = "Engin";
		course2.percent = 0;
		
		Course course3 = new Course();
		course3.id= 3;
		course3.courseName = "Java";
		course3.instructor = "Engin";
		course3.percent = 32;
	
	
    	Course[] courses = { course1, course2, course3 };
	
	for( Course course : courses ) {
		
		System.out.println(course.id);
		System.out.println(course.courseName);
		System.out.println(course.instructor);
		System.out.println(course.percent);
		System.out.println("-----");
	}
	
	
	 Login login1 = new Login (1,"Ali");
	 Login login2 = new Login (2,"Ayþe");
	 Login login3 = new Login (3,"Ahmet");
	 
	 Login[] logins = {login1,login2,login3};
	 
	 for (Login login: logins) {
		 System.out.println("Kurs Giriþiniz Baþarýlý:");
		 System.out.println(login.userId);
		 System.out.println(login.userName);
		 System.out.println("----");
		 
	
	 }
	
	
	 
	}
	
	
   }

