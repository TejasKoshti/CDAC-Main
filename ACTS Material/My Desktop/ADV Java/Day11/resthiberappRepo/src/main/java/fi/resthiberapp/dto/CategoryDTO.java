package fi.resthiberapp.dto;

public class CategoryDTO {
	
	int categoryId;
	
	String categoryName;
	
	String categoryDesp;
	
	String categoryImgUrl;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesp() {
		return categoryDesp;
	}

	public void setCategoryDesp(String categoryDesp) {
		this.categoryDesp = categoryDesp;
	}

	public String getCategoryImgUrl() {
		return categoryImgUrl;
	}

	public void setCategoryImgUrl(String categoryImgUrl) {
		this.categoryImgUrl = categoryImgUrl;
	}
	
	

}
