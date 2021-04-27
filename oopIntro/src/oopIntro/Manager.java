package oopIntro;

public class Manager {
	public void publishCourse(Course course) {
		System.out.println(course.CourseName + " yay�na al�nm��t�r.");
	}
	public void closeCourse(Course course) {
		System.out.println(course.CourseName + " yay�ndan kald�r�lm��t�r.");
	}
	public void addCourse(Course[] courses,Course course) {
		for(int i=0;i<courses.length;i++) {
			if(courses[i]==null) {
				courses[i]=course;
				break;
			}
		}
	}
	
	public void showCourses(Course[] courses) {
		System.out.println("Kurslar");
		for(Course course : courses) {
			if(course!=null) {
			System.out.println("- "+course.CourseName);
			}
		}
	}
}
