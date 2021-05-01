package Inheritance;

public class Main {

	public static void main(String[] args) {
		Student ogrenci1 = new Student();
		ogrenci1.setFirstName("Ali");
		ogrenci1.setLastName("Yalýn");
		ogrenci1.setAveragePoint(80.5);
		ogrenci1.setUserId(2);
		 
		Instructor ogretmen1 =new Instructor();
		ogretmen1.setFirstName("Veli");
		ogretmen1.setLastName("Kale");
		ogretmen1.setBranch("Bilgi Teknolojileri");
		ogretmen1.setUserId(1);
		
		UserManager um = new UserManager();
		um.getUserInfo(ogretmen1);
		um.getUserInfo(ogrenci1);
		
		System.out.println(" ");
		
		StudentManager sm = new StudentManager();
		sm.getUserInfo(ogrenci1);
		sm.getAverage(ogrenci1);
		
		System.out.println(" ");
		
		InstructorManager im = new InstructorManager();
		im.getBranch(ogretmen1);
	}

}
