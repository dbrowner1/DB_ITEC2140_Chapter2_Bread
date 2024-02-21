public class Muffins extends Bread {
    // Instance variables for Muffins
    private double bakingSoda;

    // Constructors
    public Muffins(double flour, double water, double salt, double sugar, double yeast, double bakingSoda) {
        super(flour, water, salt, 0.0, "Sourdough Bread", "not baked", "Mix, make dough, bulk rise, stretch and fold, cut and shape, second rise, preheat oven, spray with water, bake, cool");
        this.bakingSoda = bakingSoda;
        this.breadName = "Muffins";
    }

    // Getters and setters
    public double getBakingSoda() {
        return bakingSoda;
    }

    public void setBakingSoda(double bakingSoda) {
        this.bakingSoda = bakingSoda;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + String.format(", %.2f tsps of baking soda", bakingSoda);
    }

    // recipe method
    @Override
    public String recipe() {
        System.out.println("Muffins recipe: Mix, make batter, fill muffin cups, bake, cool");
        return String.valueOf(0);
    }
}
