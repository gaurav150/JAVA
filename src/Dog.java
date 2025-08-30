public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 65.00d);
    }

    public Dog(String type, double weight) {
        this(type, weight, "perky", "Curled");
    }

    public Dog(String type, double weight,
               String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            waigTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    public void makeNoise() {
        if (type == "wolf") {
            System.out.println("ow wooooooo!");
        }
        bark();
        System.out.println();
    }

    private void bark() {
        System.out.println("woof! ");
    }

    private void run() {
        System.out.println("Dog running .... ");
    }

    private void walk() {
        System.out.println("Dog is walking ");
    }

    private void waigTail() {
        System.out.println("Dog is wagging tail. ");
    }
}
