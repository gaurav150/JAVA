import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy", 1);

    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}


public class ImplementationArrayList {


    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("Apple", "Produce", 6);
        groceryArray[2] = new GroceryItem("Oranges", "Produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("yoghurt");
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Bread"));
        groceryList.add(new GroceryItem("Oranges", "Produce", 9));
        groceryList.add(0,
                new GroceryItem("Apple", "Produce", 7));
        System.out.println(groceryList);


    }

}
