package fi.RecipeSharingPlatfrom.service;

import fi.RecipeSharingPlatfrom.dto.RecipeDTO;

public interface Service {

	// Method to create a recipe
	public boolean createRecipe(RecipeDTO dto);

	// Method to update an existing recipe
	public boolean updateRecipe(Integer RecipeID, RecipeDTO dto);

	// Method to delete a recipe
	public boolean deleteRecipe(RecipeDTO dto);

	// Method to fetch a recipe by its ID
	public RecipeDTO fetchById(Integer ID);

}
