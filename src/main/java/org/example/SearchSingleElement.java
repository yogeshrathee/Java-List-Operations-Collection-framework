package org.example;
import java.util.*;

public class SearchSingleElement {
    public static void searchSingleElement(List<Integer> collection) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the search element :: ");
        int element=sc.nextInt();

        System.out.println("element present in the list ?? :: "+collection.contains(element));



    }
}
