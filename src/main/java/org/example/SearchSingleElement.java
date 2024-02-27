package org.example;
import java.util.*;

public class SearchSingleElement {
    Scanner sc=new Scanner(System.in);
    public void searchSingleElement(List<Integer> collection) {
        System.out.print("Enter the search element :: ");
        int element=sc.nextInt();

        System.out.println("element present in the list ?? :: "+collection.contains(element));
    }


    public void searchElementByIndex(List<Integer> collection) {
        System.out.print("Enter the index number to find the value :: ");
        int index=sc.nextInt();

        if((index<collection.size()) && (index > -1)) {
            System.out.println("present value of "+index+" index :: " + collection.get(index));
        }else {
            System.out.println(index+" index is not present"+
                    "\n\s\s because you enter only index between "+0+" to "+ (collection.size() - 1 )+
                            "\n\s\stotal size of list :: "+collection.size()+
                            "\n\s\sso index is not matched !!!");
        }
    }


    public void searchIndexByElement(List<Integer> collection) {
        System.out.print("Enter the element which you want to find the index :: ");
        int value = sc.nextInt();

        if(!collection.contains(value)){
            System.out.println(value+ " is not present in the list");
        }else{
            System.out.println(value+" is present in the index "+ collection.indexOf(value));
        }
    }
}
