package fi.RecipeSharingPlatfrom.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "") // Define table name in the database
public class Recipe {

	@Id
	@Column(name = "recipeid") // Column for recipe ID
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto-increment the ID value
	Integer RecipeID;

	@Column(name = "recipetitle") // Column for recipe title
	String RecipeTitle;

	@Column(name = "desp") // Column for recipe description
	String desp;

	@Column(name = "ingredients") // Column for ingredients
	String ingredients;

	@Column(name = "instruction") // Column for cooking instructions
	String instruction;

	@Column(name = "difficultylevel") // Column for difficulty level
	String difficultyLevel;

	@Column(name = "author") // Column for author name
	String author;

	@Column(name = "creationdate") // Column for creation date of the recipe
	Date creationDate;

	// Default constructor
	public Recipe() {
		super();
	}

	// Parameterized constructor to initialize recipe details
	public Recipe(Integer recipeID, String recipeTitle, String desp, String ingredients, String instruction,
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
		return "Recipe [RecipeID=" + RecipeID + ", RecipeTitle=" + RecipeTitle + ", desp=" + desp + ", ingredients="
				+ ingredients + ", instruction=" + instruction + ", difficultyLevel=" + difficultyLevel + ", author="
				+ author + ", creationDate=" + creationDate + "]";
	}

}
