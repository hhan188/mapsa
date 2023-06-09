package RecipeOrganizer.Main;

import RecipeOrganizer.Main.RecipeOrganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCommandLineInterface {
    RecipeOrganizer recipeOrganizer = new RecipeOrganizer();
    Scanner sc = new Scanner(System.in);

    public void welcome() {
        System.out.println("""
                ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗                                                              \s
                ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗                                                             \s
                ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║                                                             \s
                ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║                                                             \s
                ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝                                                             \s
                 ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝                                                              \s
                                                                                                                                                                 \s
                              ██████╗ ███████╗ ██████╗██╗██████╗ ███████╗                                                                                      \s
                              ██╔══██╗██╔════╝██╔════╝██║██╔══██╗██╔════╝                                                                                      \s
                              ██████╔╝█████╗  ██║     ██║██████╔╝█████╗                                                                                        \s
                              ██╔══██╗██╔══╝  ██║     ██║██╔═══╝ ██╔══╝                                                                                        \s
                              ██║  ██║███████╗╚██████╗██║██║     ███████╗                                                                                      \s
                                ╚═╝  ╚═╝╚══════╝ ╚═════╝╚═╝╚═╝     ╚══════╝                                                                                      \s
                                                                                                                                                                 \s
                                         ██████╗ ██████╗  ██████╗  █████╗ ███╗   ██╗██╗███████╗ █████╗ ████████╗██╗ ██████╗ ███╗   ██╗     █████╗ ██████╗ ██████╗\s
                                        ██╔═══██╗██╔══██╗██╔════╝ ██╔══██╗████╗  ██║██║╚══███╔╝██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║    ██╔══██╗██╔══██╗██╔══██╗
                                        ██║   ██║██████╔╝██║  ███╗███████║██╔██╗ ██║██║  ███╔╝ ███████║   ██║   ██║██║   ██║██╔██╗ ██║    ███████║██████╔╝██████╔╝
                                        ██║   ██║██╔══██╗██║   ██║██╔══██║██║╚██╗██║██║ ███╔╝  ██╔══██║   ██║   ██║██║   ██║██║╚██╗██║    ██╔══██║██╔═══╝ ██╔═══╝\s
                                        ╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║ ╚████║██║███████╗██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║    ██║  ██║██║     ██║    \s
                                         ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝     ╚═╝    \s
                                                                                                                                                                 \s""");
    }

    public void start() {
        System.out.println("""
                1-Add Recipe.
                2-Show Recipes.
                3-Edit Recipes.
                4-Add Category.
                5-Edit Categories.
                6-Search By Ingredient.
                7-Search By Category.
                8-Save Changes.
                """);
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                addRecipe();
            case 2:
                showRecipes();
            case 3:
                editRecipes();
            case 4:
                addCategory();
            case 5:
                editCategory();
            case 6:
                searchByIngredient();
            case 7:
                searchByCategory();
            case 8:
                saveChanges();
            default:
                start();
        }
    }

    public void addRecipe() {
        System.out.println("Enter your recipe name : ");
        String name = sc.next();
        while ((recipeOrganizer.enterNameForAddRecipe(name)) == null) {
            System.out.println("This recipe name is defined, please choose another name");
            name = sc.next();
        }
        System.out.println("Enter your recipe categories : \nif entering categories done enter \"0\"");
        ArrayList<String> categories = new ArrayList<>();
        while (true) {
            String category = sc.next();
            if (category.equals("0"))
                break;
            categories.add(category);
        }

        System.out.println("Enter your recipe ingredients : \nif entering ingredients done enter \"0\"");
        ArrayList<String> ingredients = new ArrayList<>();

        String ingredient = "";
        while (true) {
            ingredient = sc.next();
            if (ingredient.equals("0"))
                break;
            ingredients.add(ingredient);
        }

        System.out.println("Enter your instruction for this recipe :");

        String instruction = sc.next();
        instruction += sc.nextLine();

        if (recipeOrganizer.addRecipe(
                recipeOrganizer.enterCategoriesForAddRecipe(categories),
                recipeOrganizer.enterNameForAddRecipe(name),
                ingredients,
                instruction))
            System.out.println("Your recipe added successfully.");
        else System.out.println("Your recipe doesn't add \nplease try again carefully");
        start();
    }

    public void showRecipes() {
        System.out.println("Choose one you want see details");
        recipeOrganizer.printRecipes();
//        choosing a recipe ID
        int chooseID = sc.nextInt();
//        print name
        System.out.println(recipeOrganizer.recipes.get(chooseID - 1).name);
//        print categories
        recipeOrganizer.printSpecificRecipeCategory(recipeOrganizer.recipes.get(chooseID - 1));
//        print ingredients
        for (String ingredient : recipeOrganizer.recipes.get(chooseID - 1).ingredients)
            System.out.print(ingredient + ", ");
        System.out.println();
        System.out.println(recipeOrganizer.recipes.get(chooseID - 1).instruction);
        start();
    }

    public void editRecipes() {
        System.out.println("Choose one you want edit");
        recipeOrganizer.printRecipes();
        int chooseID = sc.nextInt();
        if (chooseID > recipeOrganizer.recipes.size()) {
            System.err.println("Try again !!!\nchoose between these numbers !!!");
            editRecipes();
        }

        System.out.println("""
                Choose what you want edit :
                1-Edit name.
                2-Edit category.
                3-Edit ingredients.
                4-Edit instruction.
                5-Main menu.
                """);
        int editChoose = sc.nextInt();
        switch (editChoose) {
            case 1: {
                System.out.println("Enter recipe new name");
                recipeOrganizer.nameEdit(recipeOrganizer.recipes.get(chooseID - 1), sc.next());
                start();
            }
            case 2: {
                System.out.println("Enter your recipe new categories : \nif entering categories done enter \"0\"");
                ArrayList<String> categories = new ArrayList<>();
                while (!sc.next().equals("0"))
                    categories.add(sc.next());
                recipeOrganizer.categoryEdit(recipeOrganizer.recipes.get(chooseID - 1), categories);
                start();
            }
            case 3: {
                System.out.println("Enter your recipe new ingredients : \nif entering ingredients done enter \"0\"");
                ArrayList<String> ingredients = new ArrayList<>();
                while (!sc.next().equals("0"))
                    ingredients.add(sc.next());
                recipeOrganizer.ingredientsEdit(recipeOrganizer.recipes.get(chooseID - 1), ingredients);
                start();
            }
            case 4: {
                System.out.println("Enter your recipe new instruction : ");
                String word = sc.next();
                String instruction = word + sc.nextLine();
                recipeOrganizer.instructionEdit(recipeOrganizer.recipes.get(chooseID - 1), instruction);
                start();
            }
            default:
                start();
        }
    }

    public void addCategory() {
        System.out.println("Enter category name : ");
        String name = sc.next();
        if (recipeOrganizer.addCategory(name)) {
            System.out.println("Your category has been added");
            start();
        } else{
            System.out.println("Your category has not added !");
            start();
        }
    }

    public void editCategory() {
        recipeOrganizer.printCategories();
        System.out.println("Enter current category name :");
        String current = sc.next();
        System.out.println("Enter new category name :");
        String New = sc.next();
        recipeOrganizer.editCategory(current, New);
        start();
    }

    public void searchByIngredient() {
        System.out.println("Enter ingredient you search for : ");
        String ingredient = sc.next();
        recipeOrganizer.searchForIngredients(ingredient);
        start();
    }

    public void searchByCategory() {
        System.out.println("Enter category you search for : ");
        String category = sc.next();
        recipeOrganizer.searchForCategory(category);
        start();
    }

    public void saveChanges() {
        recipeOrganizer.saveChanges();
    }


}
