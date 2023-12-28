package com.algorithmPrograms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {25,10,1,3,5,9,100};

        System.out.println("Default numbers :");
        printArray(numbers);
        bubbleSort(numbers);
        System.out.println();
        System.out.println("Sorted numbers :");
        printArray(numbers);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int numberS = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = numberS;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + ",");
        }
    }
}

