package projects.Librarybookmanagementsystem;

import java.util.Scanner;

public class LibraryBookManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static int bookId[] = new int[100];
    static String bookName[] = new String[100];
    static String authorName[] = new String[100];
    static boolean issued[] = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n===== Library Book Management System =====");

            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    searchBook();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    returnBook();
                    break;

                case 5:
                    System.out.println("Thanks for using Library System");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Add Book
    public static void addBook() {

        System.out.println("Enter book id : ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book name : ");
        bookName[count] = sc.nextLine();

        System.out.println("Enter author name : ");
        authorName[count] = sc.nextLine();

        issued[count] = false;

        count++;

        System.out.println("Book added successfully");
    }

    // Search Book
    public static void searchBook() {

        System.out.println("Enter book id : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                System.out.println("Book Found");

                System.out.println("Book id : " + bookId[i]);
                System.out.println("Book name : " + bookName[i]);
                System.out.println("Author name : " + authorName[i]);
                System.out.println("Issued : " + issued[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Issue Book
    public static void issueBook() {

        System.out.println("Enter book id : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (!issued[i]) {
                    issued[i] = true;
                    System.out.println("Book issued successfully");
                } else {
                    System.out.println("Book already issued");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Return Book
    public static void returnBook() {

        System.out.println("Enter book id : ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (issued[i]) {
                    issued[i] = false;
                    System.out.println("Book returned successfully");
                } else {
                    System.out.println("Book was not issued");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }
}