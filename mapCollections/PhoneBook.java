package mapCollections;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            
            if (choice.equals("1")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("Contact added.");
            } else if (choice.equals("2")) {
                System.out.print("Enter name to search: ");
                String name = scanner.nextLine();
                String phoneNumber = phoneBook.get(name);
                if (phoneNumber != null) {
                    System.out.println(name + ": " + phoneNumber);
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter name to remove: ");
                String name = scanner.nextLine();
                if (phoneBook.remove(name) != null) {
                    System.out.println("Contact removed.");
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        
        scanner.close();
    }
}
