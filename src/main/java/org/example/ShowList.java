package org.example;

import java.util.*;

public class ShowList{
    public static void showList(List<Integer> collection) {
        System.out.println(collection);
    }
    public static void showSortedList(List<Integer> collection) {
        Collections.sort(collection);
        System.out.println(collection);
    }
}
