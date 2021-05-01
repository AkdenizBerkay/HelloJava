package OdevInheritance;

public class UserManager {
	public void getUserInfo(User user) {
		System.out.println("Kullanýcý Bilgileri");
		System.out.println("--------------------");
		System.out.println("Id: " + user.getUserId());
		System.out.println("FirstName: " + user.getFirstName());
		System.out.println("LastName: " + user.getLastName());
		System.out.println("       ");
	}
}
