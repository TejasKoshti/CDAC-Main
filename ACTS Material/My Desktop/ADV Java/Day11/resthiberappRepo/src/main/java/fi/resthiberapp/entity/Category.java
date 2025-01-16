package fi.resthiberapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@Column(name="categoryid")
	int categoryId;
	
	@Column(name="categoryname")
	String categoryName;
	
	@Column(name="categorydesc")
	String categoryDesp;
	
	@Column(name="categoryimageurl")
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
