public class SourdoughBread extends Bread {
    // Instance variables for unique properties of Sourdough Bread
    private double ripeSourdoughStarter;

    // Constructors
    public SourdoughBread(double flour, double water, double salt, double yeast, double ripeSourdoughStarter) {
        super(flour, water, salt, yeast, "Sourdough Bread", "not baked", "Mix, make dough, bulk rise, stretch and fold, cut and shape, second rise, preheat oven, spray with water, bake, cool");
        this.ripeSourdoughStarter = ripeSourdoughStarter;
    }

    // Override getIngredients method
    @Override
    public String getIngredients() {
        return String.format("%.2f cups of flour\n%.2f cups of water\n%.2f tsps of salt\n%.2f tsp of yeast\n%.2f cup of ripe sourdough starter",
                getFlour(), getWater(), getSalt(), getYeast(), ripeSourdoughStarter);
    }

    public double getSalt() {
        return 0;
    }

    public double getYeast() {
        return 0;
    }

    public double getWater() {
        return 0;
    }

    public double getFlour() {
        return 0;
    }

    // Override recipe method
    @Override
    public String recipe() {
        return "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n3. Bulk Rise\n4. Stretch and fold the dough\n5. Cut and shape the dough\n" +
                "6. Second rise\n7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "8. Spray the loaf with lukewarm water.\n9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "10. Remove the bread from the oven.\n11. Let the bread cool until good to eat.";
    }
}