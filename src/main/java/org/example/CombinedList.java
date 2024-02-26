package org.example;

import java.util.*;

public class CombinedList {
    public static void combinedList(List<Integer>collection) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Total size of list:: ");
        int value=sc.nextInt();

        List<Integer> collection1=new ArrayList<>();

        System.out.print("Enter the "+value+" elements :: ");
        for(int i=0;i<value;i++){
            collection1.add(sc.nextInt());
        }

        collection.addAll(collection1);
        System.out.println("Combined list Successfully !!!");

    }
}
