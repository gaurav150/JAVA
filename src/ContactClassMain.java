import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ContactClassMain {

    public static void main(String[] args) {
        List<ContactClass> emails = ContactDataClass.getData("email");
        List<ContactClass> phones = ContactDataClass.getData("phone");
        printData("Phone List", phones);
        printData("email List", emails);

        Set<ContactClass> emailContacts = new HashSet<>(emails);
        Set<ContactClass> phoneContacts = new HashSet<>(phones);
        printData("phone Contacts ", phoneContacts);
        printData("email Contacts", emailContacts);

        int index = emails.indexOf(new ContactClass("Robin Hood"));
        ContactClass robinHood = emails.get(index);
        robinHood.addEmail("SherWood Forest");
        robinHood.addEmail("SherWood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com",
                "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        Set<ContactClass> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        Set<ContactClass> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersection of emails (A) and phones (B)", intersectAB);

        Set<ContactClass> intersectBA = new HashSet<>(emailContacts);
        intersectBA.retainAll(phoneContacts);
        printData("(B ∩ A) Intersection of emails (B) and phones (A)", intersectBA);

        Set<ContactClass> minusAB = new HashSet<>(emailContacts);
        minusAB.removeAll(phoneContacts);
        printData("(A - B)  emails (A) - phones (B)", minusAB);

        Set<ContactClass> minusBA = new HashSet<>(phoneContacts);
        minusBA.removeAll(emailContacts);
        printData("(B - A)  phones (B) -emails (A) ", minusBA);

        Set<ContactClass> SymmetricDifferenceAB = new HashSet<>();
        SymmetricDifferenceAB.addAll(minusAB);
        SymmetricDifferenceAB.addAll(minusBA);
        printData("Symmetric Difference of A & B", SymmetricDifferenceAB);


    }

    public static void printData(String header, Collection<ContactClass> contacts) {
        System.out.println("_+".repeat(20));
        System.out.println(header);
        System.out.println("_=".repeat(20));
        contacts.forEach(System.out::println);


//        List<ContactClass> phoneContacts = ContactDataClass.getData("phone");
//        List<ContactClass> emailContacts = ContactDataClass.getData("email");
//
//        System.out.println("Phones:");
//        phoneContacts.forEach(System.out::println);
//
//        System.out.println("\nEmails:");
//        emailContacts.forEach(System.out::println);


    }


}
