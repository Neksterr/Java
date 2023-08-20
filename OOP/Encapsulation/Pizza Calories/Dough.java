    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 200 || weight < 1) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private double getBakingTechniqueModifier() {
        switch (bakingTechnique) {
            case "Crispy":
                return 0.9;

            case "Chewy":
                return 1.1;

            case "Homemade":
                return 1.0;


        }
        return 0;
    }

    private double getFlourModifier() {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;
        }
        return 0.0;
    }

    public double calculateCalories() {

        return (2 * weight) * getFlourModifier() * getBakingTechniqueModifier();
    }
}
