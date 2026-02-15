import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMap {
    public static void main(String[] args) {

        List<ContactClass> phones = ContactDataClass.getData("phone");
        List<ContactClass> emails = ContactDataClass.getData("email");

//        NavigableSet<ContactClass> sorted =  new TreeSet<>(phones);
        Comparator<ContactClass> mySort = Comparator.comparing(ContactClass::getName);
        NavigableSet<ContactClass> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames =  new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println("just names contents are -> "+justNames);


    }
}
