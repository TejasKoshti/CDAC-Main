package fi.RecipeSharingPlatfrom.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fi.RecipeSharingPlatfrom.dto.RecipeDTO;
import fi.RecipeSharingPlatfrom.entity.Recipe;
import fi.RecipeSharingPlatfrom.repositories.RecipeRepository;

@Service
public class ServiceImpl implements fi.RecipeSharingPlatfrom.service.Service {

	@Autowired
	RecipeRepository recipeRepository;

	// Method to create a new recipe
	@Override
	public boolean createRecipe(RecipeDTO dto) {

		Recipe recipe = new Recipe();
		BeanUtils.copyProperties(dto, recipe); // copy properties from DTO to entity
		recipeRepository.save(recipe); // save recipe in the database
		return true;
	}

	// Method to update an existing recipe
	@Override
	public boolean updateRecipe(Integer RecipeID, RecipeDTO dto) {

		Optional<Recipe> recipe = recipeRepository.findById(RecipeID);
		if (recipe.isPresent()) {
			recipe.get().setRecipeTitle(dto.getRecipeTitle());
			recipe.get().setDesp(dto.getDesp());
			recipe.get().setDifficultyLevel(dto.getDifficultyLevel());
			recipe.get().setAuthor(dto.getAuthor());
			recipe.get().setInstruction(dto.getInstruction());
			recipeRepository.save(recipe.get());
			return true;
		} else {
			throw new IllegalArgumentException("recipe with ID " + RecipeID + " not found."); // exception handling
		}

	}

	// Method to delete a recipe
	@Override
	public boolean deleteRecipe(RecipeDTO dto) {
		if (dto != null && dto.getRecipeID() != null) {
			Optional<Recipe> recipe = recipeRepository.findById(dto.getRecipeID());
			if (recipe.isPresent()) {
				recipeRepository.delete(recipe.get()); // delete the recipe from the database
				return true;
			} else {
				throw new IllegalArgumentException("Recipe with ID " + dto.getRecipeID() + " not found.");
			}
		} else {
			throw new IllegalArgumentException("Invalid RecipeDTO or RecipeID."); // exception Handling
		}
	}

	// Method to fetch a recipe by its ID
	@Override
	public RecipeDTO fetchById(Integer ID) {

		Optional<Recipe> recipe = recipeRepository.findById(ID);

		if (recipe.isPresent()) {
			RecipeDTO dto = new RecipeDTO();
			BeanUtils.copyProperties(recipe.get(), dto); // copy properties to DTO
			return dto;
		} else {
			throw new IllegalArgumentException("Recipe with ID " + ID + " not found."); // exception Handling
		}

	}

}
