public class Recipe {
    public static void main(String[] args) {
        SourdoughBread sourdoughBread = new SourdoughBread(5.0, 1.5, 2.5, 1.0, 1.0);
        Pastry pastry = new Pastry(2.0, 1.0, 1.0, 1.0, "Fruit Filling");

        displayRecipe(sourdoughBread);
        displayRecipe(pastry);
    }

    public static void displayRecipe(Bread bread) {
        System.out.println(bread.breadName + " class testing");
        System.out.println("\nIngredients of " + bread.breadName + " are:\n" + bread.getIngredients());
        System.out.println("\nA recipe of " + bread.breadName + ":");
        System.out.println(bread.recipe);

        bread.bake();
        System.out.println(bread);
        System.out.println("The " + bread.breadName + " is " + bread.state + " now.\n");
    }
}
