package org.example;
import java.util.*;

public class SearchMultipleElements {
    public static void searchMultipleElements(List<Integer> collection) {
        List<Integer> collection1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many values you want to search :: ");
        int element=sc.nextInt();

        System.out.print("Enter the "+element+" elements :: ");
        for(int i=0;i<element;i++){
            collection1.add(sc.nextInt());
        }

        collection.containsAll(collection1);

        List<Integer> presentValue=new ArrayList<>();
        List<Integer> notPresentValue=new ArrayList<>();

        for(int value : collection1){
            if(collection.contains(value)){
                presentValue.add(value);
            }
            else {
                notPresentValue.add(value);
            }
        }

        System.out.println("present values :: "+presentValue);
        System.out.println("not present values :: "+notPresentValue);

    }
}
