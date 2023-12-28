package com.algorithmPrograms;

public class InsertionSort {
    public static void main(String[] args) {
        String[] cities = {"Assam","Bihar","Rajasthan","Chhattisgarh",
                "Haryana","Kerala","Madhya Pradesh","Maharashtra",
                "Punjab","Goa","Karnataka","Gujarat"
        };
        System.out.println("Default cities:");
        printArray(cities);
        insertionSort(cities);
        System.out.println();
        System.out.println("Sorted cities:");
        printArray(cities);
    }
    public static void insertionSort(String[] CT) {
        int n = CT.length;
        for (int i = 1; i < n; ++i) {
            String iCT = CT[i];
            int j = i - 1;
            while (j >= 0 && CT[j].compareTo(iCT) > 0) {
                CT[j + 1] = CT[j];
                j = j - 1;
            }
            CT[j + 1] = iCT;
        }
    }
    public static void printArray(String[] arr) {
        for (String city : arr) {
            System.out.print(city + " ");
        }
    }
}
