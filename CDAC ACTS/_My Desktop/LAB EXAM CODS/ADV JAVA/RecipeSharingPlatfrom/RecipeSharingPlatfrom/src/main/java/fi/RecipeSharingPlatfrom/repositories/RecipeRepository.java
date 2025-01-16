package fi.RecipeSharingPlatfrom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.RecipeSharingPlatfrom.entity.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

}
