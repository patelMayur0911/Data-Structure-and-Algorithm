package com.algorithmPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeRecursion {
    // Iterative method
    public static List<String> iterativeMethod(String input) {
        List<String> list1 = new ArrayList<>();
        list1.add(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            char nowChar = input.charAt(i);
            List<String> list2 = new ArrayList<>();

            for (String list1Element : list1) {
                for (int j = 0; j <= list1Element.length(); j++) {
                    list2.add(list1Element.substring(0, j) + nowChar + list1Element.substring(j));
                }
            }

            list1 = list2;
        }

        return list1;
    }

    // Recursive method
    public static List<String> RecursiveMethod(String input) {
        List<String> list1 = new ArrayList<>();
        RecursiveMethodInput("", input, list1);
        return list1;
    }

    private static void RecursiveMethodInput(String s1, String leftOut, List<String> listF) {
        int n = leftOut.length();
        if (n == 0) {
            listF.add(s1);
        } else {
            for (int i = 0; i < n; i++) {
                RecursiveMethodInput(
                        s1 + leftOut.charAt(i),
                        leftOut.substring(0, i) + leftOut.substring(i + 1),
                        listF
                );
            }
        }
    }

    public static void main(String[] args) {
        String input = "ABC";

        List<String> ls1 = iterativeMethod(input);
        System.out.println("Iterative : " + ls1);

        List<String> ls2 = RecursiveMethod(input);
        System.out.println("Recursive : " + ls2);

        boolean isEqual = Arrays.equals(ls1.toArray(new String[0]), ls2.toArray(new String[0]));

        System.out.println("Arrays are same : " + isEqual);
    }
}
