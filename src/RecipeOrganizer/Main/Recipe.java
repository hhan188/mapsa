package RecipeOrganizer.Main;

import java.util.ArrayList;
import java.util.Objects;

public class Recipe {
    private static int id = 1;
    int ID;
    ArrayList<String> category;
    String name;
    ArrayList<String> ingredients;
    String instruction;

    public Recipe(ArrayList<String> category, String name, ArrayList<String> ingredients, String instruction) {
        this.category = category;
        this.name = name;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.ID = id++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
