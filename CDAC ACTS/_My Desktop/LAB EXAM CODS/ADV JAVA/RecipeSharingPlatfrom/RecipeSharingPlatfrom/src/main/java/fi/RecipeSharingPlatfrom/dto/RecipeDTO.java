package fi.RecipeSharingPlatfrom.dto;

import java.sql.Date;

public class RecipeDTO {

	Integer RecipeID;

	String RecipeTitle;

	String desp;

	String ingredients;

	String instruction;

	String difficultyLevel;

	String author;

	Date creationDate;

	// Default constructor
	public RecipeDTO() {
		super();
	}

	// Parameterized constructor to initialize recipe details
	public RecipeDTO(Integer recipeID, String recipeTitle, String desp, String ingredients, String instruction,
			String difficultyLevel, String author, Date creationDate) {
		super();
		RecipeID = recipeID;
		RecipeTitle = recipeTitle;
		this.desp = desp;
		this.ingredients = ingredients;
		this.instruction = instruction;
		this.difficultyLevel = difficultyLevel;
		this.author = author;
		this.creationDate = creationDate;
	}

	// Getters and setters for all fields
	public Integer getRecipeID() {
		return RecipeID;
	}

	public void setRecipeID(Integer recipeID) {
		RecipeID = recipeID;
	}

	public String getRecipeTitle() {
		return RecipeTitle;
	}

	public void setRecipeTitle(String recipeTitle) {
		RecipeTitle = recipeTitle;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	// Method to return recipe details as a string
	@Override
	public String toString() {
		return "RecipeDTO [RecipeID=" + RecipeID + ", RecipeTitle=" + RecipeTitle + ", desp=" + desp + ", ingredients="
				+ ingredients + ", instruction=" + instruction + ", difficultyLevel=" + difficultyLevel + ", author="
				+ author + ", creationDate=" + creationDate + "]";
	}

}
