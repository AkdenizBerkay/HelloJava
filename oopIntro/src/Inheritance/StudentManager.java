package Inheritance;

public class StudentManager extends UserManager {
	
	public void getAverage(Student student) {
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Ortalamasý: " + student.getAveragePoint());
	}
	
	@Override
	public void getUserInfo(User user) {
		System.out.println("Adý: " + user.getFirstName());
		System.out.println("Ortalamasý: " + ((Student)user).getAveragePoint());
	}
}
