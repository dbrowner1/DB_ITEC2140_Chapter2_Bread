public class SourdoughBread extends Bread {
    // Unique instance variables for SourdoughBread
    private double yeast;
    private double ripeSourdoughStarter;

    // Constructors
    public SourdoughBread(double flour, double water, double salt, double yeast, double ripeSourdoughStarter) {
        super(flour, water, salt, 0.0, 0.0); // Assuming no sugar or baking powder for SourdoughBread
        this.yeast = yeast;
        this.ripeSourdoughStarter = ripeSourdoughStarter;
        this.breadName = "Sourdough Bread";
    }

    // Getters, setters, toString method, recipe method, and other methods you want to include
    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public double getRipeSourdoughStarter() {
        return ripeSourdoughStarter;
    }

    public void setRipeSourdoughStarter(double ripeSourdoughStarter) {
        this.ripeSourdoughStarter = ripeSourdoughStarter;
    }

    @Override
    public String toString() {
        return breadName + ": " + super.toString() +
                String.format(", %.2f tsps of yeast, %.2f cup of ripe sourdough starter", yeast, ripeSourdoughStarter);
    }

    // Recipe method for SourdoughBread
    public void recipe() {
        System.out.println("A recipe of " + breadName + ":");
        System.out.println("1. Mix flour, water, salt, yeast, and ripe sourdough starter.");
        System.out.println("2. Make the dough");
        System.out.println("3. Bulk Rise");
        System.out.println("4. Stretch and fold the dough");
        System.out.println("5. Cut and shape the dough");
        System.out.println("6. Second rise");
        System.out.println("7. Preheat the oven to 450°F towards the tail end of the second rise.");
        System.out.println("8. Spray the loaf with lukewarm water.");
        System.out.println("9. Bake the bread at 400°F for 20 minutes, until deep golden brown.");
        System.out.println("10. Remove the bread from the oven.");
        System.out.println("11. Let the bread cool until good to eat.");
    }
}