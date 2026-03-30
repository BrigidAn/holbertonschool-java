import java.util.*;

public class Program {
    public static void main(String[] args) {
        Phone phone1 = new Phone("11", "9888-5551");
        Phone phone2 = new Phone("17", "99602-6725");
        Phone phone3 = new Phone("21", "9882-1514");
        Phone phone4 = new Phone("13", "8771-2344");
        Phone phone5 = new Phone("17", "3221-1788");
        Phone phone6 = new Phone("17", "3444-1112");
        Phone phone7 = new Phone("17", "3311-1566");

        PhoneList phoneList1 = new PhoneList();

        try {
            phoneList1.addPhone("John Doe", phone1);
            phoneList1.addPhone("John Doe", phone2);
            phoneList1.addPhone("John Doe", phone7);
            phoneList1.addPhone("Tom Smith", phone3);
            phoneList1.addPhone("Tom Smith", phone5);
            phoneList1.addPhone("Carlos Alberto", phone4);
            phoneList1.addPhone("Carlos Alberto", phone6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Testing duplicates
        try {
            phoneList1.addPhone("John Doe", new Phone("11", "9888-5551")); // same phone for same person
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            phoneList1.addPhone("John Doe", new Phone("17", "3444-1112")); // phone belongs to another person
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Print results
        printPhones(phoneList1, "John Doe");
        printPhones(phoneList1, "Tom Smith");
        printPhones(phoneList1, "Carlos Alberto");
        printPhones(phoneList1, "Richard Bob");
    }

    private static void printPhones(PhoneList phoneList, String name) {
        Set<Phone> phones = phoneList.isFind(name);
        if (phones == null) {
            System.out.println("Phones not found");
        } else {
            System.out.println(phones);
        }
    }
}
