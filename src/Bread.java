public abstract class Bread {
    // Instance variables
    protected double flour;
    protected double water;
    protected double salt;
    protected double sugar;
    protected double bakingPowder;
    protected double yeast;
    protected String breadName;
    protected String state;
    protected String recipe;

    // Default constructor
    public Bread(double flour, double water, double salt, double v, String sourdough_bread, String not_baked, String s) {
        this.state = "not baked";
    }

    // Constructor with all parameters
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.state = "not baked";
    }

    // Getters and setters
    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    // Getters and setters for water
    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    // Getters and setters for salt
    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    // Getters and setters for sugar
    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    // Getters and setters for bakingPowder
    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    // Getters and setters for yeast
    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    // Getters and setters for breadName
    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    // Getters and setters for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getters and setters for recipe
    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    // Other methods, including toString, bake, getIngredients, and other methods

    // Bake method to change the state of the bread
    public void bake() {
        if (!this.state.equals("baked")) {
            this.state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        } else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    // GetIngredients method
    public String getIngredients() {
        // Return a String of all the ingredients
        // Customize this based on your requirements
        return "Ingredients of " + breadName + " are:\n" +
                flour + " cups of flour\n" +
                water + " cups of water\n" +
                salt + " tsps of salt\n" +
                sugar + " cups of sugar\n" +
                bakingPowder + " tsps of baking powder\n" +
                yeast + " tsp of yeast";
    }

    // recipe method
    public abstract String recipe();

    // Other methods, including toString, recipe, and any other custom methods
}