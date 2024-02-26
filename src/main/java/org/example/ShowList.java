package org.example;

import java.util.*;

public class ShowList{
    public static void showList(List<Integer> collection) {
        Collections.sort(collection);
        System.out.println(collection);
    }
}
