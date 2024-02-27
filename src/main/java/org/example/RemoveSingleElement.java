package org.example;
import java.util.*;

public class RemoveSingleElement {
    public static void removeSingleElement(List<Integer> collection) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element index number which element you want to remove from the list  :: ");
        int value=sc.nextInt();

        if((value < collection.size()) && (value > -1)) {
            collection.remove(value);
            System.out.println("successfully removed " + value + " index value from the list !!!");
        }else {
            System.out.println(value+" index not found in the list !!!" +
                    "\n\s\s because you enter only index between "+0+" to "+ (collection.size() - 1 )+
                            "\n\s\stotal size of list :: "+collection.size()+
                    "\n\s\sso index is not matched !!!");
        }
    }
}
