import java.util.*;


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

        //        ------------------Player---------------------------
//        Player player = new Player();
//        player.name = "gautam";
//        player.weapon = "Sword";
//        player.health = 10;
//        int damage = 5;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health " + player.healthRemaining());
//        player.restoreHealth(98);
//        System.out.println("After Restoring Health " + player.healthRemaining());

        EnhancedPlayer gautam = new EnhancedPlayer("Gautam");
        System.out.println("Initial Health is "+gautam.healthRemaining());

        Movie theMovie = new Movie("Star wars");
        theMovie.watchMovie();

        Movie theMovies =  new Adventure("Star wars");
        theMovies.watchMovie();

        Movie theMoviess = Movie.getMovie("Adventure","Star wars");
        theMoviess.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type(A for Adventure" +
                    ",C for Comedy " +
                    "S for ScienceFiction, or Q to quit)");
            String type =s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
        s.close();

        DogAbs dogA = new DogAbs("Wolf","big",100);
        dogA.makeNoise();
        doAnimalStuffAbs(dogA);

        ArrayList<AnimalAbstract> animals  = new ArrayList<>();
        animals.add(dogA);
        animals.add(new DogAbs("German Shepherd","big",150));
        animals.add(new FishAbs("GoldFish","small",1));
        animals.add(new FishAbs("Shark","Medium",600));
        animals.add(new DogAbs("Pug","small",15));
        animals.add(new HorseAbs("clydeSale","large",1000));
        for (AnimalAbstract animalax:animals){
            doAnimalStuffAbs( animalax);
            if(animalax instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }


        PlayingCard aceOfHearts = new PlayingCard("Hearts","ace");
        PlayingCard kingOfClubs = new PlayingCard("Clubs","kings");
        PlayingCard queenSpades = new PlayingCard("Spades","queen");

        List<PlayingCard> cards = Arrays.asList(aceOfHearts,kingOfClubs,queenSpades);
        cards.forEach(t -> System.out.println(t + " : "+t.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard r: cards){
            if(!deck.add(r)){
                System.out.println("Found A duplicate for "+ r);

            }
        }
        System.out.println(deck);





    }

    public static void doAnimalStuffAbs(AnimalAbstract animal) {
        animal.makeNoise();
        animal.move("slow");
        System.out.println(animal);
        System.out.println("_________");}

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
        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast",
                "Acer", 27, "2540 * 1440");
        Motherboard motherboard = new Motherboard("Bj-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell"
                , computerCase, motherboard, theMonitor);
//        thePC.getMonitor().drawPixelAt(8,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();

//        --------------Kitchen Practice -------------------
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
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