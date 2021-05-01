package oopIntro;

public class Kategori {
	private int CategoryId;
	private String CategoryName;
	
	public Kategori() {
		
	}	
	
	public Kategori(int categoryId, String categoryName) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
	}
	
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int CategoryId) {
		this.CategoryId = CategoryId;
	}
	public String getCategoryName() {
		return CategoryName+ "!";
	}
	public void setCategoryName(String CategoryName) {
		this.CategoryName = CategoryName;
	}
}
