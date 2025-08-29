public class TernaryOperatorPractice {
    public static void main(String[] args) {
         boolean isCar  = false;
         if(!isCar){
             System.out.println("This is not supposed to happen");
         }
         String makeOfCar = "Volkswagen";
         boolean isDomestic = makeOfCar == "volkswagen" ? false : true;

         if(isDomestic){
             System.out.println("This car is domestic to our country");

         }

         String s =  (isDomestic) ? "This car is domestic":"This car is not domestic";
        System.out.println(s);
    }
}
