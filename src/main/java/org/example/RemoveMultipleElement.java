package org.example;
import java.util.*;

public class RemoveMultipleElement {
    public static void removeMultipleElement(Collection<Integer> collection) {
        Scanner sc=new Scanner(System.in);
        List<Integer> collection1 = new ArrayList<>();

        System.out.print("total values you want to remove :: ");
        int value=sc.nextInt();

        System.out.print("enter the "+value+" elements :: ");
        for(int i=0;i<value;i++){
            collection1.add(sc.nextInt());
        }

        List<Integer> presentValue = new ArrayList<>();
        List<Integer> notPresentValue = new ArrayList<>();

        for(int element : collection1){
            if(collection.contains(element)){
                presentValue.add(element);
            }
            else {
                notPresentValue.add(element);
            }
        }
        System.out.println("Removed element was present in the list :: "+presentValue);
        System.out.println("Removed element was not present in the list :: "+notPresentValue);
        System.out.println("So we are only unable to remove this elements :: "+presentValue);
        collection.removeAll(collection1);

    }
}
