import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        List<ContactClass> emails = ContactDataClass.getData("email");
        List<ContactClass> phones = ContactDataClass.getData("phone");

        List<ContactClass> fullList =  new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("------------------------");

        Map<String, ContactClass> contacts = new HashMap<>();

        for (ContactClass contactClass: fullList) {
            contacts.put(contactClass.getName(), contactClass);
        }

        contacts.forEach((k,v) -> System.out.println("Key= "+k+" value= "+v));
        System.out.println("------------------");
        System.out.println(contacts.get("Mickey Mouse"));

        System.out.println(contacts.get("Chuck Brown"));
        ContactClass defaultContact = new ContactClass("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));
        contacts.clear();
        for (ContactClass contactClass: fullList) {
            ContactClass duplicate =  contacts.put(contactClass.getName(), contactClass);
            if( duplicate != null) {
//                System.out.println("duplicate = "+ duplicate);
//                System.out.println("current = "+ contactClass);
                contacts.put(contactClass.getName(), contactClass.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k,v) -> System.out.println("Key= "+k+" value= "+v));

        System.out.println("--------------------");
        contacts.clear();

        for (ContactClass contactClass: fullList) {
            contacts.putIfAbsent(contactClass.getName(), contactClass);
        }

        contacts.forEach((k,v) -> System.out.println("Key= "+k+" value= "+v));

        for (ContactClass contactClass: fullList) {
            ContactClass duplicate = contacts.putIfAbsent(contactClass.getName(), contactClass);
            if(duplicate != null) {
                contacts.put(contactClass.getName(), contactClass.mergeContactData(duplicate));
            }
        }

        System.out.println("--------".repeat(4));
        contacts.clear();
        fullList.forEach(contactClass -> contacts.merge(contactClass.getName(), contactClass,
                ContactClass::mergeContactData));

        contacts.forEach((k,v) -> System.out.println("Key= "+k+" value= "+v));
    }
}
