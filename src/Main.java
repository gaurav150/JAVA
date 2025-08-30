//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();

        System.out.println(car.getColor());
        System.out.println(car.getDoors());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println("Now setting new values");
        car.setColor("Red");
        car.setMake("TATA");
        car.setDoors(4);
        car.setConvertible(false);
        car.setModel("model14");
        car.describeCar();
//        new -----------------------------------Account codes---------------------------------
        ClassesChallenge classesChallenge = new ClassesChallenge();
        System.out.println(classesChallenge.getAccountBalance());
        classesChallenge.amountDeposit(4500);
        System.out.println(classesChallenge.getAccountBalance());
        classesChallenge.amountWithdraw(20000);
        classesChallenge.amountWithdraw(2000);
        System.out.println(classesChallenge.getAccountBalance());
        ClassesChallenge cc = new ClassesChallenge(1245758l,
                2300.09d, "Ram",
                "ram@gmail.com", 9876545356l);
        // new ----------------------Animal codes ------------------
        System.out.println("===============");
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");

        Dog yorkie = new Dog("Yorkie", 15.5);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("GoldenRetriever", 65.89
                , "fluffy", "swimmer");
        doAnimalStuff(retriever, "slow");
        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.56, 2, 3);
        doAnimalStuff(goldie, "fast");
//        ---------------------Student codes ---------------
        Student max = new Student("max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy",
                8, "carole");
        System.out.println(jimmy);

    }

    // new ----------------------Animal codes ------------------
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_________");

//      -----------------------printing information---------------
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");
        System.out.println("End");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l'));
        String helloworldlower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloworldlower)) {
            System.out.println("values are exactly match");
        }
        if (helloWorld.equalsIgnoreCase(helloworldlower)) {
            System.out.println("Values are ignoring case.");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("Starting starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World.");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String Contains World.");
        }
        if (helloWorld.contentEquals(helloworldlower)) {
            System.out.println("values are exactly match");
        }
//        --------------------Composition && Inheritance Implementation ------------
        ComputerCase computerCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast",
                "Acer",27,"2540 * 1440");
        Motherboard motherboard = new Motherboard("Bj-200","Asus",
                4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell"
                ,computerCase,motherboard,theMonitor);
//        thePC.getMonitor().drawPixelAt(8,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
//            return;
        }
        System.out.printf("First Char = %c %n", string.charAt(0));
        System.out.printf("Last Char = %c %n", string.charAt(length - 1));
    }
}