public class HorseAbs extends Mammal {
    public HorseAbs(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("fast running");
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitlyType() + " shed in the spring.");

    }

    @Override
    public void makeNoise() {
        System.out.println("Horse Neighs");
    }
}
