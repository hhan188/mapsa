package RecipeOrganizer.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class RecipeOrganizer {
    ArrayList<Recipe> recipes = new ArrayList<>();
    ArrayList<String> categories = new ArrayList<>();

    RecipeOrganizer() {
        try {
            readRecipeFromFile();
        }catch (Exception e){

        }
    }

//    public void searchRecipes(String searchModel) {
//        if (searchModel.equalsIgnoreCase("category"))
//            searchForCategory("Category");
//        else if (searchModel.equalsIgnoreCase("ingredients"))
//            searchForIngredients("");
//    }

//    public void searchRecipes(int searchModel) {
//        if (searchModel == 1)
//            searchForCategory("");
//        else if (searchModel == 2) {
//            searchForIngredients("");
//        }
//    }

    void searchForCategory(String categoryName) {
        boolean ifFlag = true;
        for (Recipe recipe : recipes) {
            if (recipe.category.contains(categoryName)) {
                System.out.println(recipe.name);
                ifFlag = false;
            }
        }
        if (ifFlag)
            System.out.println("Nothing found with this category !!");
    }

    void searchForIngredients(String ingredient) {
        boolean ifFlag = true;
        for (Recipe recipe : recipes) {
            if (recipe.ingredients.contains(ingredient)) {
                System.out.println(recipe.name + "\n");
                ifFlag = false;
            }
        }
        if (ifFlag)
            System.out.println("Nothing found with this ingredient !!");
    }

    String enterNameForAddRecipe(String name) {
        for (Recipe recipe : recipes)
            if (recipe.name.equalsIgnoreCase(name)) {
                return null;
            }
        return name;
    }

    ArrayList<String> enterCategoriesForAddRecipe(ArrayList<String> categories) {
        for (String categ : categories)
            if (!this.categories.contains(categ))
                this.categories.add(categ);
         return (ArrayList<String>) categories.stream().distinct().collect(Collectors.toList());

    }

    boolean addRecipe(ArrayList<String> category, String name, ArrayList<String> ingredients, String instruction) {
        return recipes.add(new Recipe(category, name, ingredients, instruction));
    }

    boolean addCategory(String name) {
        for (String category : categories) {
            if (category.equalsIgnoreCase(name))
                return false;
        }
        return categories.add(name);
    }

    void editCategory(String current, String newCategory) {
        for (String category : categories)
            if (category.equalsIgnoreCase(current))
                category = newCategory;
            else {
                System.out.println("This category doesn't exist!");
            }
    }

//    void assignRecipeToCategory(Recipe recipe, int categoryIndex) {
//        if (recipe.category.contains(categories.get(categoryIndex))) {
//            System.out.println("This recipe have this category before !!");
//            return;
//        }
//        recipe.category.add(categories.get(categoryIndex - 1));
//    }
//
//    void unAssignCategory(Recipe recipe, int categoryIndex) {
//        if (!recipe.category.contains(categories.get(categoryIndex))) {
//            System.out.println("This recipe haven't this category before !!");
//            return;
//        }
//        recipe.category.remove(recipe.category.get(categoryIndex));
//    }

    void printSpecificRecipeCategory(Recipe recipe) {
        if (recipe.category.size() == 0) {
            System.out.println("This recipe haven't any category");
            return;
        }
        for (int i = 0; i < recipe.category.size(); i++) {
            System.out.println("\t**" + (i + 1) + "**"
                    + "\n+------------+\n"
                    + "\t" + recipe.category.get(i)
                    + "\n+------------+");


        }
    }

    void printRecipes(){
        if (recipes.size() == 0) {
            System.out.println("You've not add any recipes yet!!");
            return;
        }
        for (Recipe recipe : recipes)
            System.out.println(recipe.ID + "-" + recipe.name);
    }

    void printCategories() {
        if (categories.size() == 0) {
            System.out.println("You've not add any categories yet!!");
            return;
        }
        for (String category : categories)
            System.out.println(category);
    }

//    public void printEditForms() {
//        System.out.println("""
//                1-Edit name
//                2-Edit Category
//                3-Edit ingredient
//                4-Edit instruction""");
//    }
//
//    public void updateRecipes(int chosenID) {
//        for (Recipe recipe : recipes) {
//            if (recipe.ID == chosenID)
//
//            }
//
//    }

    void nameEdit(Recipe recipe, String name) {
        recipe.name = name;
    }

    void categoryEdit(Recipe recipe, ArrayList<String> category) {
        recipe.category = category;
    }

    void ingredientsEdit(Recipe recipe, ArrayList<String> ingredients) {
        recipe.ingredients = ingredients;
    }

    void instructionEdit(Recipe recipe, String instruction) {
        recipe.instruction = instruction;
    }

    private void readRecipeFromFile() {
//        Category1 Category2 Category3,name,ingredient1 ingredient2 ingredient3,instruction
        try (FileReader reader = new FileReader("C:\\Users\\Admin\\Desktop\\WorkSpaceJava\\Class hall tamrin\\mapsa\\src\\RecipeOrganizer\\RecipeOrganizerFile.csv")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] recipeBuilder = line.split(",");
                if (recipeBuilder.length > 4) {
                    System.out.println("Bad recipe importation format!!");
                    return;
                }
                ArrayList<String> category = new ArrayList<>();
                String name = recipeBuilder[1];
                ArrayList<String> ingredients = new ArrayList<>();
                String instruction = recipeBuilder[3];
                Collections.addAll(ingredients, recipeBuilder[2].split(" "));
                Collections.addAll(category, recipeBuilder[0].split(" "));
                if (!categories.containsAll(category))
                    for (String addCategory : category)
                        addCategory(addCategory);
                recipes.add(new Recipe(category, name, ingredients, instruction));
            }
        } catch (IOException e) {
            System.out.println("file not found!");
        }

    }

    void saveChanges() {
        try (FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\WorkSpaceJava\\Class hall tamrin\\mapsa\\src\\RecipeOrganizer\\RecipeOrganizerFile.csv");
            BufferedWriter bw = new BufferedWriter(writer)){

            for (Recipe recipe : recipes) {
                StringBuilder categoriesForBuilder = new StringBuilder();
                StringBuilder ingredients = new StringBuilder();

                for (String category : recipe.category)
                    categoriesForBuilder.append(category).append(" ");

                for (String ingredient : recipe.ingredients)
                    ingredients.append(ingredient).append(" ");

                String name = recipe.name;
                String instruction = recipe.instruction;


                String recipeBuilder = categoriesForBuilder.toString().trim() + "," +
                        name + "," +
                        ingredients.toString().trim() + "," +
                        instruction + '\n';

                bw.write(recipeBuilder);
            }
        } catch (IOException e) {
            System.out.println("Recipes cannot saved!!");
            e.printStackTrace();
        }
    }

}