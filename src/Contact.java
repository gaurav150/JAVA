public record Contact(String name, String phoneNumber) {

    // Factory method (optional)
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact contact)) return false;
        return this.name.equals(contact.name); // equality by name only
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

