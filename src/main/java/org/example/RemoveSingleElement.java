package org.example;
import java.util.*;

public class RemoveSingleElement {
    public static void removeSingleElement(List<Integer> collection) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter remove element :: ");
        int value=sc.nextInt();

        collection.remove(value);
        System.out.println("successfully removed "+value+" from the list !!!");
    }
}
