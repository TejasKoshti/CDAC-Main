////package services;
////
////public class asd {
////	
////	//this is RESTFul services i will make in eclips  wait for me , 1st will give all files and start modification , and this my file srturete 
////	
//////	Implements of GET [5 marks]
//////			Implements of crteat [10 marks]
//////					Implements of update [10 marks]
//////							Implements of delete  [5 marks]
//////									Implements of GET [5 marks]
////	// Eorror handling proper resoprn code, validation [10 marks ]
////	
////	
////
////	
////	// Correct or update delete part also add exception handling , but rember dont add extra line , i want this code will me human writtern and my , so just modifie it not chnage 
////											
////										
////
////}
//// NOW GIVE ME ALL CODES ONE BY ONE ADD STYUDENT WRTTIEN COMMETS , BUT DONT CHNAGE THE CODE , AS WELL AS AT LAST GIVE ME THE STEPS HOW I RUN THIS ALL 4 METHIODS ON POSTMAN 
////
//
//



//Here are the steps to test all the methods using Postman for your Recipe Sharing Platform:
//
//1. Create Recipe (POST Request)
//Method: POST
//URL: http://localhost:8080/recipes/createrecipe
//Body: Select raw and JSON from the dropdown. Then, provide the data as JSON in the body:
//json
//Copy code
//{
//  "RecipeTitle": "Spaghetti Bolognese",
//  "desp": "A classic Italian pasta dish.",
//  "ingredients": "Spaghetti, Ground Beef, Tomatoes, Onion, Garlic, Olive Oil, Salt, Pepper",
//  "instruction": "Cook pasta, brown beef, prepare sauce, mix and serve.",
//  "difficultyLevel": "Medium",
//  "author": "Chef John",
//  "creationDate": "2025-01-01"
//}
//Send Request: Click on Send. The response should be true indicating that the recipe has been created successfully.
//2. Update Recipe (PUT Request)
//Method: PUT
//URL: http://localhost:8080/recipes/update/{ID}
//Replace {ID} with the actual RecipeID you want to update (e.g., http://localhost:8080/recipes/update/1).
//Body: Select raw and JSON from the dropdown. Then, provide the updated recipe data as JSON in the body:
//json
//Copy code
//{
//  "RecipeTitle": "Updated Spaghetti Bolognese",
//  "desp": "A delicious twist on the classic Italian dish.",
//  "ingredients": "Spaghetti, Ground Beef, Tomatoes, Onion, Garlic, Olive Oil, Salt, Pepper, Fresh Basil",
//  "instruction": "Cook pasta, brown beef, prepare sauce with basil, mix and serve.",
//  "difficultyLevel": "Medium",
//  "author": "Chef John",
//  "creationDate": "2025-01-01"
//}
//Send Request: Click on Send. The response should be true, indicating that the recipe has been updated.
//3. Delete Recipe (DELETE Request)
//Method: DELETE
//URL: http://localhost:8080/recipes/delete/{RecipeID}
//Replace {RecipeID} with the actual RecipeID you want to delete (e.g., http://localhost:8080/recipes/delete/1).
//Send Request: Click on Send. The response should be true, indicating that the recipe has been deleted.
//4. Get Recipe by ID (GET Request)
//Method: GET
//URL: http://localhost:8080/recipes/getbyid/{ID}
//Replace {ID} with the actual RecipeID you want to fetch (e.g., http://localhost:8080/recipes/getbyid/1).
//Send Request: Click on Send. The response should be a JSON object with the recipe details:
//json
//Copy code
//{
//  "RecipeID": 1,
//  "RecipeTitle": "Spaghetti Bolognese",
//  "desp": "A classic Italian pasta dish.",
//  "ingredients": "Spaghetti, Ground Beef, Tomatoes, Onion, Garlic, Olive Oil, Salt, Pepper",
//  "instruction": "Cook pasta, brown beef, prepare sauce, mix and serve.",
//  "difficultyLevel": "Medium",
//  "author": "Chef John",
//  "creationDate": "2025-01-01"
//}
//Summary of Steps in Postman:
//Open Postman.
//Set the HTTP method (POST, PUT, DELETE, GET).
//Set the URL for the API endpoint.
//For POST and PUT requests, select raw and JSON in the request body, and provide the necessary data.
//Click on Send to execute the request.
//Review the response in Postman to confirm whether the operation was successful.
//Let me know if you need further clarification or help with the steps!
//
//
//




//
//
