package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(6);
        System.out.println(list);
        System.out.print(insertionSort(list));
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        int key, j, temp;
        for(int i = 1; i < list.size(); i++) {
            key = list.get(i);
            j = i - 1;
            while(j >= 0 && key < list.get(j)) {
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j--;
            }
        }
        return list;
    }
}
