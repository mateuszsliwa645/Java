import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean flag = true;
        System.out.println("----MENU----\r");
        System.out.println("1. Quit \r");
        System.out.println("2. Add contact \r");
        System.out.println("3. Print contacts \r");
        System.out.println("4. Modify contact \r");
        System.out.println("5. Remove contact \r");
        System.out.println("6. Find contact");
        while (flag) {
            System.out.print("Chose option: \r");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("----MENU----\r");
                    System.out.println("1. Quit \r");
                    System.out.println("2. Add contact \r");
                    System.out.println("3. Print contacts \r");
                    System.out.println("4. Modify contact \r");
                    System.out.println("5. Remove contact \r");
                    System.out.println("6. Find contact");
                    break;
                case 1:
                    System.out.println("Quiting...");
                    flag = false;
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your number: ");
                    String number = sc.nextLine();
                    mobilePhone.addContact(name,number);
                    break;
                case 3:
                    mobilePhone.printContacts();
                    break;
                case 4:
                    System.out.print("Enter name of contact that you want modify: ");
                    String modify = sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = sc.nextLine();
                    mobilePhone.modifyContact(modify,newName,newPhoneNumber);
                    break;
                case 5:
                    System.out.print("Enter name of contact that you want to remove: ");
                    name = sc.nextLine();
                    mobilePhone.removeContact(name);
                    break;
                case 6:
                    System.out.print("Enter the name of contact that you want to found: ");
                    name = sc.nextLine();
                    System.out.println(mobilePhone.queryContact(name));
                    break;

                default:
                    System.out.println("Wrong choice try again.");
                    break;
            }
        }
    }
}