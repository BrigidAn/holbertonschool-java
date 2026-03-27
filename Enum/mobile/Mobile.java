import java.util.*;

public class Mobile {
    private ArrayList<Contact> contacts;

    // Constructor
    public Mobile() {
        contacts = new ArrayList<>();
    }

    // Get contact position
    public int getContactPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Add contact
    public void addContact(Contact contact) throws Exception {
        if (getContactPosition(contact.getName()) != -1) {
            throw new Exception("Could not add contact. Contact with this name already exists.");
        }
        contacts.add(contact);
    }

    // Update contact
    public void updateContact(Contact oldContact, Contact newContact) throws Exception {
        int oldPosition = getContactPosition(oldContact.getName());

        if (oldPosition == -1) {
            throw new Exception("Could not modify contact. Contact does not exist");
        }

        int newPosition = getContactPosition(newContact.getName());

        if (newPosition != -1 && newPosition != oldPosition) {
            throw new Exception("Could not modify contact. Contact with this name already exists");
        }

        contacts.set(oldPosition, newContact);
    }

    // Remove contact
    public void removeContact(Contact contact) throws Exception {
        int position = getContactPosition(contact.getName());

        if (position == -1) {
            throw new Exception("Could not remove contact. Contact does not exist");
        }

        contacts.remove(position);
    }

    // List contacts
    public void listContacts() {
        for (Contact c : contacts) {
            System.out.println(c.getName() + " -> " + c.getPhoneNumber() + " (" + c.getType() + ")");
        }
    }
}
