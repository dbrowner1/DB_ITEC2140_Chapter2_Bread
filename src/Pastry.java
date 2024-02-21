public class Pastry extends Bread {
    private String filling;

    public Pastry(double flour, double water, double salt, double yeast, String filling) {
        super(flour, water, salt, 0.0, "Sourdough Bread", "not baked", "Mix, make dough, bulk rise, stretch and fold, cut and shape, second rise, preheat oven, spray with water, bake, cool");
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + String.format(", filling: %s", filling);
    }

    // recipe method
    @Override
    public String recipe() {
        System.out.println("Pastry recipe: Mix, make dough, add filling, shape, bake, cool");
        return String.valueOf(0);
    }
}