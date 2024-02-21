public class StrawberryShortCake extends Bread {
    // Instance variables for StrawberryShortCake
    private double newFilling;

    // Constructors
    public StrawberryShortCake(double flour, double water, double salt, double sugar, double yeast, double newFilling) {
        super(flour, water, salt, 0.0, "Sourdough Bread", "not baked", "Mix, make dough, bulk rise, stretch and fold, cut and shape, second rise, preheat oven, spray with water, bake, cool");
        this.newFilling = newFilling;
        this.breadName = "Strawberry Short Cake";
    }

    // Getters and setters
    public double getNewFilling() {
        return newFilling;
    }

    public void setNewFilling(double newFilling) {
        this.newFilling = newFilling;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + String.format(", %.2f tsps of new filling", newFilling);
    }

    // recipe method
    @Override
    public String recipe() {
        System.out.println("Strawberry Short Cake recipe: Mix, make dough, add new filling, bake, cool");
        return String.valueOf(0);
    }
}
