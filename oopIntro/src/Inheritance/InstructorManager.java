package Inheritance;

public class InstructorManager extends UserManager{
	public void getBranch(Instructor instructor) {
	System.out.println(instructor.getFirstName()+ " " + instructor.getLastName() + " Branþý: " + instructor.getBranch());
	}
}
