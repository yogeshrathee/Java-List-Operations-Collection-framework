package org.example;

import java.util.*;

public class AddElement {
    Scanner sc=new Scanner(System.in);
    public void addElement(List<Integer>collection) {
        System.out.print("Enter an element :: ");
        collection.add(sc.nextInt());
        System.out.println("element add Successfully !!!!");

    }
    public  void addElementByIndex(List<Integer>collection){
        System.out.print("Enter the index number :: ");
        int index = sc.nextInt();

        System.out.print("Enter the value which  you add in "+index+" index :: ");
        int value=sc.nextInt();

        collection.add(index,value);

        System.out.println(value+ " is add successfully in "+index + " index");
    }
}
