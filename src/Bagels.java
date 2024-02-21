public class Bagels extends Bread {
    // Instance variables for Bagels
    private double boilingTime;

    // Constructors
    public Bagels(double flour, double water, double salt, double sugar, double yeast, double boilingTime) {
        super(flour, water, salt, 0.0, "Sourdough Bread", "not baked", "Mix, make dough, bulk rise, stretch and fold, cut and shape, second rise, preheat oven, spray with water, bake, cool");
        this.boilingTime = boilingTime;
        this.breadName = "Bagels";
    }

    public double getBoilingTime() {
        return boilingTime;
    }

    public void setBoilingTime(double boilingTime) {
        this.boilingTime = boilingTime;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %.2f minutes of boiling time", boilingTime);
    }

    @Override
    public String recipe() {
        System.out.println("Bagels recipe: Mix, make dough, shape, boil, bake, cool");
        return String.valueOf(0);
    }
}
