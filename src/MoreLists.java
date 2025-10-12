import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "pineapple", "milk"};
        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yoghurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println(groceries.toArray().length);
        System.out.println("Third item is " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }
        groceries.add("yoghurt");
        groceries.add("milk");
        groceries.add("yoghurt");
        System.out.println("first = " + groceries.indexOf("yoghurt"));
        System.out.println("first = " + groceries.lastIndexOf("yoghurt"));
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("milk");
        groceries.removeAll(List.of("Apples", "bananas"));
        System.out.println(groceries);
        groceries.retainAll(List.of("Apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty " + groceries.isEmpty());
        System.out.println("length of empty list is: " + groceries.toArray().length);
        groceries.addAll(Arrays.asList("milk", "curd", "cheese", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));


    }
}
