package com.Krall;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        while (true) {
            System.out.println("Enter count:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                count = scanner.nextInt();
                break;
            }
            scanner.nextLine();
        }

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

        System.out.println(Arrays.toString(sortIntegers(returnedArray)));

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++) {
            while (true) {
                System.out.println("Enter a number for position " + i +":");
                boolean isAnInt = scanner.hasNextInt();
                if (isAnInt) {
                    int number = scanner.nextInt();
                    array[i] = number;
                    break;
                }
                scanner.nextLine();
            }
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}