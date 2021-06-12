package com.java101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        Main bubbleSort = new Main();
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please type a number (type exit for next stage) :");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            } else {
                numbers.add(Integer.parseInt(command));
            }
        }
        int[] arrayNumbers = numbers.stream().mapToInt(i -> i).toArray();
        bubbleSort.bubbleSort(arrayNumbers);
        int n = arrayNumbers.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arrayNumbers[i] + (i == n - 1 ? "" : " < "));
        System.out.println();
    }
}
