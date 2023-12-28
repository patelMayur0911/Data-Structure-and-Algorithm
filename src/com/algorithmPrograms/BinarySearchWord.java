package com.algorithmPrograms;

import java.util.Arrays;

public class BinarySearchWord {
    public static void main(String[] args) {
        String[] cities = {"State","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
        Arrays.sort(cities);
        String gujarat = "Gujarat";
        int index = Arrays.binarySearch(cities, gujarat);

        if (index >= 0) {
            System.out.println(" gujarat is in the list ");
        } else {
            System.out.println("gujarat is not in the list.");
        }
    }
}
