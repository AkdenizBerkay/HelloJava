package Inheritance;

public class StudentManager extends UserManager {
	
	public void getAverage(Student student) {
		System.out.println(student.getFirstName()+ " " + student.getLastName() + " Ortalamas�: " + student.getAveragePoint());
	}
	
	@Override
	public void getUserInfo(User user) {
		System.out.println("Ad�: " + user.getFirstName());
		System.out.println("Ortalamas�: " + ((Student)user).getAveragePoint());
	}
}
