package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Category backend= new Category();
		backend.CategoryId=1;
		backend.CategoryName="Backend Technology";
		
		Course javaCourse = new Course(1,"Java");
		Course csharpCourse = new Course(1,"C#");
		
		Manager man = new Manager();
		Course[] courses = new Course[5];
		
		
		man.addCourse(courses, csharpCourse);
		man.addCourse(courses, javaCourse);
		
		man.showCourses(courses);
		
		man.publishCourse(javaCourse);
		man.closeCourse(csharpCourse);
		
		
	}

}
