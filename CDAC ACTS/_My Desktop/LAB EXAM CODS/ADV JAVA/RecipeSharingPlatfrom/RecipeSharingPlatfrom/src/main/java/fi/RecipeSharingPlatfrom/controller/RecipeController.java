package fi.RecipeSharingPlatfrom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fi.RecipeSharingPlatfrom.dto.RecipeDTO;
import fi.RecipeSharingPlatfrom.service.Service;

@RestController
@RequestMapping("/recipes") // end point to access recipe-related methods
public class RecipeController {

	@Autowired
	Service service;

	// end point to create a new recipe
	@PostMapping("/createrecipe")
	public boolean createRecipe(@RequestBody RecipeDTO dto) {

		service.createRecipe(dto);
		return true;
	}

	// end point to update an existing recipe
	@PutMapping("/update/{ID}")
	public boolean updateRecipe(@PathVariable Integer RecipeID, @RequestBody RecipeDTO dto) {
		return service.updateRecipe(RecipeID, dto);
	}

	// end point to delete a recipe
	@DeleteMapping("/delete/{RecipeID}")
	public boolean deleteRecipe(@PathVariable Integer RecipeID) {
		RecipeDTO dto = new RecipeDTO();
		dto.setRecipeID(RecipeID);
		return service.deleteRecipe(dto);
	}

	// end point to fetch a recipe by ID
	@GetMapping("/getbyid/{ID}")
	public RecipeDTO fetchById(@PathVariable("ID") Integer ID) {
		return service.fetchById(ID);
	}

}
