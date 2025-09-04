import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ContactClass {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public ContactClass(String name) {
        this( name,null);
    }

    public ContactClass(String name,String email) {
        this( name,email,0);
    }


    public ContactClass(String name, long phone) {
        this(name,null,phone);
    }

    public ContactClass(String name, String email, long phone) {
        this.name = name;
        if(emails != null){
            emails.add(email);
        }
        if(phone > 0){
            String p = String.valueOf(phone);
            p = "(%s) %s-%s".formatted(p.substring(0,3),
                    p.substring(3,6),p.substring(6));
            phones.add(p);
        }
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name,emails,phones);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ContactClass that = (ContactClass) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }

    public void addEmail(String companyName){
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0),names[names.length-1],
                companyName.replaceAll(" ","").toLowerCase());
        if(!emails.add(email)){
            System.out.println(name+" already has email "+email);
        }else{
            System.out.println(name + " now has email "+email);
        }

    }



    public ContactClass mergeContactData(ContactClass contact){
        ContactClass newContact = new ContactClass(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

    public void replaceEmailIfExists(String oldEmail,String newEmail){
        if(emails.contains(oldEmail)){
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }
}
