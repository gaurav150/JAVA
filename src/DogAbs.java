public class DogAbs extends Mammal {

    public DogAbs(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Dog speed is fast");
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitlyType() + " Sheds hair all the time.");
    }

    @Override
    public void makeNoise() {
        if (type == "wolf") {
            System.out.println("Howling");
        }
        System.out.println("Woof.");

    }

}
