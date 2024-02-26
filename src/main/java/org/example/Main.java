package org.example;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total elements you want to add in 1st list :: ");
        int value = sc.nextInt();

        List<Integer> collection = new ArrayList<>();

        System.out.print("Enter the "+value+" elements(integer type) :: ");
        for (int i = 0; i < value; i++) {
            collection.add(sc.nextInt());
        }

        int choice;
        do {
            System.out.println();
            System.out.println("1. Show sorted list element");
            System.out.println("2. Search one element");
            System.out.println("3. Search multiple elements");
            System.out.println("4. Remove one element");
            System.out.println("5. Remove multiple elements");
            System.out.println("6. Size of list");
            System.out.println("7. add a element");
            System.out.println("8. combined the list of the element");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice :: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Show sorted list element");
                    ShowList.showList(collection);
                    break;
                case 2:
                    System.out.println("Search one element");
                    SearchSingleElement.searchSingleElement(collection);
                    break;
                case 3:
                    System.out.println("Search multiple element");
                    SearchMultipleElements.searchMultipleElements(collection);
                    break;
                case 4:
                    System.out.println("Remove one element");
                    RemoveSingleElement.removeSingleElement(collection);
                    break;
                case 5:
                    System.out.println("Remove multiple elements");
                    RemoveMultipleElement.removeMultipleElement(collection);
                    break;
                case 6:
                    System.out.println("Size of the list (total elements are) :: "+collection.size());
                    break;
                case 7:
                    System.out.println("Add a element ");
                    AddElement.addElement(collection);
                    break;
                case 8:
                    System.out.println("Combined the lists ");
                    CombinedList.combinedList(collection);
                    break;

                case 0:
                    System.out.println(".............Thank you for using this Software !!!!");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
        while (choice != 0);
        sc.close();
    }
}
