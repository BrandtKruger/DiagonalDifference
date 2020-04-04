package com.kruger.brandt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int diagonalDifference(List<List<Integer>> arr) {

        if (arr.size() > 100 || arr.size() < (-100))
            return 0;

        Integer leftDiagonal = 0;
        Integer rightDiagonal = 0;

        // Do leftDiagonal
        for (int x = 0; x < arr.size(); x++){
            leftDiagonal += arr.get(x).get(x).intValue();
        }

        // Do rightDiagonal
        int y = 0;
        for (int x = arr.size() - 1; x >= 0; x--, y++){
            rightDiagonal += arr.get(x).get(y).intValue();
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        list1.add(11);
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();

        list3.add(10);
        list3.add(8);
        list3.add(-12);

        arr.add(0,list1);
        arr.add(1, list2);
        arr.add(2, list3);

        int result = diagonalDifference(arr);

        System.out.println(result);
    }
}