package org.example;

import java.util.*;

public class AddElement {
    public static void addElement(List<Integer>collection) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an element :: ");
        collection.add(sc.nextInt());
        System.out.println("element add Successfully !!!!");

    }
}
