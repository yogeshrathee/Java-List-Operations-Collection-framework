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
            System.out.println("|-------------------------------------------|");
            System.out.println("|         CHOOSE YOUR OPERATION             |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|                                           |");
            System.out.println("|   1. Show normal list element             |");
            System.out.println("|   2. Search one element                   |");
            System.out.println("|   3. Search multiple elements             |");
            System.out.println("|   4. Remove by the index number           |");
            System.out.println("|   5. Remove multiple elements             |");
            System.out.println("|   6. Size of list                         |");
            System.out.println("|   7. add a element                        |");
            System.out.println("|   8. combined the list of the element     |");
            System.out.println("|   9. Add an element in any index          |");
            System.out.println("|   10. Find an element by the index        |");
            System.out.println("""
                    |   11. Show Sorted List\s
                    |       \s\s(Warning :- if you sort the list once,\s
                    |       \s\sthen you unable to see normal list.\s
                    |       \s\sAfter that you always see sorted list)""");

            System.out.println("|   12. show index number of an element     |");
            System.out.println("|   13. Update an element of any index      |");
            System.out.println("|   0. Exit                                 |");
            System.out.println("|                                           |");
            System.out.println("|-------------------------------------------|");
            System.out.println();
            System.out.print("\nEnter your choice :: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("normal list element");
                    ShowList.showList(collection);
                    break;
                case 2:
                    System.out.println("Search one element");
                    SearchSingleElement searchSingleElement1=new SearchSingleElement();
                    searchSingleElement1.searchSingleElement(collection);
                    break;
                case 3:
                    System.out.println("Search multiple element");
                    SearchMultipleElements.searchMultipleElements(collection);
                    break;
                case 4:
                    System.out.println("Remove element by the index number");
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
                    AddElement addElement1=new AddElement();
                    addElement1.addElement(collection);
                    break;
                case 8:
                    System.out.println("Combined the lists ");
                    CombinedList.combinedList(collection);
                    break;
                case 9:
                    System.out.println("Add an element in any index ");
                    AddElement addElementByIndex1=new AddElement();
                    addElementByIndex1.addElementByIndex(collection);
                    break;
                case 10:
                    System.out.println("find an element by the index");
                    SearchSingleElement searchSingleElement2=new SearchSingleElement();
                    searchSingleElement2.searchElementByIndex(collection);
                    break;
                case 11:
                    System.out.println("Show Sorted List");
                    ShowList.showSortedList(collection);
                    break;
                case 12:
                    System.out.println("show index number of an element");
                    SearchSingleElement searchIndexByElement1=new SearchSingleElement();
                    searchIndexByElement1.searchIndexByElement(collection);
                    break;
                case 13:
                    System.out.println("Update an element with the help of an index number");
                    AddElement addElement3=new AddElement();
                    addElement3.updateElement(collection);
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
