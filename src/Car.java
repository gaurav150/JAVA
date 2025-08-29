public class Car {
    private String make = "Tesla";
    private String model = "model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors(){
        return doors;
    }
    public boolean getConvertible(){
        return convertible;
    }


    public void describeCar(){
        System.out.println("Doors: "+doors);
        System.out.println("Color: "+color);
        System.out.println("Model: "+model);
        System.out.println("Make: "+make);
        System.out.println("Convertible: "+convertible);
    }
}

