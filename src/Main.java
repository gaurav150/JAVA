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
        ClassesChallenge cc = new ClassesChallenge(1245758l,2300.09d,"Ram","ram@gmail.com",9876545356l);
    }
}