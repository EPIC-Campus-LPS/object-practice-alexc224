public class Weights {
    // new set of 3 planets with same weight from user
    private String planet;
    private double gravity;
    private double weight;

    public Weights(String p, double g, double w){
        planet = p;
        gravity = g;
        weight = w;
    }

    public String getPlanet(){
        return planet;
    }

    public double getGravity() {
        return gravity;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double multi( double multiplier, double weight){
        double final_weight = multiplier * weight;
        final_weight = Math.round(final_weight * 10);
        final_weight /= 10;
        return final_weight;
    }
}
