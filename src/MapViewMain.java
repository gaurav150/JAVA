import java.util.*;

public class MapViewMain {

    public static void main(String[] args) {
        Map<String, ContactClass> contacts= new HashMap<>();
        ContactDataClass.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactDataClass.getData("email").forEach(c -> contacts.put(c.getName(), c));

        Set<String> keysView =  contacts.keySet();
        System.out.println(keysView);
        Set<String> copyOfKeys =  new TreeSet<>(contacts.keySet());
        System.out.println(copyOfKeys);
        if(contacts.containsKey("Linus Van Pelt")) {
            System.out.println("Linus and I go way back, So of course I have info");
        }
        keysView.remove("Daffy Duck");
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        copyOfKeys.remove("Linus Van Pelt");
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.retainAll(List.of("Linus Van Pelt", "Charlie Brown", "Robin Hood",
                "Mickey Mouse"));
        System.out.println(keysView);
        contacts.forEach((k, v) -> System.out.println(v));

        keysView.clear();
        System.out.println(contacts);

        ContactDataClass.getData("phone").forEach(c -> contacts.put(c.getName(), c));
        ContactDataClass.getData("email").forEach(c -> contacts.put(c.getName(), c));



    }
}
