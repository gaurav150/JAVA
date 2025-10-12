public class FishAbs extends AnimalAbstract {

    public FishAbs(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "GoldFish") {
            System.out.println("swish");
        }
        System.out.println("splash");

    }
}
