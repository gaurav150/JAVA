public class Contact {
    private String name;
    private String phoneNumber;



    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Factory method (optional)
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact contact = (Contact) obj;
        return this.name.equals(contact.name); // equality by name only
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

