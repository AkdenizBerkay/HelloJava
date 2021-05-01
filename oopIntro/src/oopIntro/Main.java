package oopIntro;

public class Main {

	public static void main(String[] args) {
		 
		/*
		Category backend= new Category();
		backend.CategoryId=1;
		backend.CategoryName="Backend Technology";
		
		Course javaCourse = new Course(1,"Java");
		Course csharpCourse = new Course(1,"C#");
		
		Manager man = new Manager();
		Course[] courses = new Course[5];
		
		
		System.out.println("Ödev2");
		
		man.addCourse(courses, csharpCourse);
		man.addCourse(courses, javaCourse);
		
		man.showCourses(courses);
		
		man.publishCourse(javaCourse);
		man.closeCourse(csharpCourse);
		*/
		
		Product product1 = new Product(1,"Lenova V14",15000,"16 GB Ram",10);
		Product product2 = new Product();
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
 		product2.setId(2);
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product1.getId());
		System.out.println(product1.getName());
		System.out.println(product1.getDetail());
		System.out.println(product1.getUnitPrice());
		System.out.println(product1.getDiscount());
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		System.out.println(product2.getId());
		System.out.println(product2.getName());
		System.out.println(product2.getDetail());
		System.out.println(product2.getUnitPrice());
		System.out.println(product2.getDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Kategori category1 = new Kategori();
		category1.setCategoryName("Ýçecek");
		category1.setCategoryId(1);
		
		Kategori category2 = new Kategori();
		category2.setCategoryName("Yiyecek");
		category2.setCategoryId(2);
		
		System.out.println(category1.getCategoryId());
		System.out.println(category1.getCategoryName());
		System.out.println(category2.getCategoryId());
		System.out.println(category2.getCategoryName());
	}

}
