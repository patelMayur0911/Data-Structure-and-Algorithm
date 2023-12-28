package com.algorithmPrograms;

public class MergeSort {
    public static void main(String[] args) {
        String[] cities = {"Assam", "Bihar", "Rajasthan", "Chhattisgarh", "Haryana", "Kerala", "Madhya Pradesh", "Maharashtra", "Punjab", "Goa", "Karnataka", "Gujarat"};

        System.out.println("Original List:");
        printArray(cities);
        mergeSort(cities, 0, cities.length - 1);
        System.out.println("Sorted List:");
        printArray(cities);
    }

    public static void mergeSort(String[] arr, int min, int max) {
        if (min < max) {
            int mid = min + (max - min) / 2;

            mergeSort(arr, min, mid);
            mergeSort(arr, mid + 1, max);
            merge(arr, min, mid, max);
        }
    }

    public static void merge(String[] arr, int min, int mid, int max) {
        int n1 = mid - min + 1;
        int n2 = max - mid;

        String[] arr1 = new String[n1];
        String[] arr2 = new String[n2];

        System.arraycopy(arr, min, arr1, 0, n1);
        System.arraycopy(arr, mid + 1, arr2, 0, n2);

        int i = 0, j = 0, k = min;

        while (i < n1 && j < n2) {
            if (arr1[i].compareTo(arr2[j]) <= 0) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void printArray(String[] arr) {
        for (String city : arr) {
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
