abstract class Mammal extends AnimalAbstract {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitlyType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");

    }

    public abstract void shedHair();

}


public abstract class AnimalAbstract {
    protected String type;
    private final String size;
    private final double weight;


    public AnimalAbstract(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitlyType() {
        return getClass().getSimpleName() + "( " + type + " )";
    }
}
