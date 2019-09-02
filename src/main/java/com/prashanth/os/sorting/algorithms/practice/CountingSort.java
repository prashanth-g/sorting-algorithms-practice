package com.prashanth.os.sorting.algorithms.practice;

public class CountingSort {

  public static void main(String[] args) {
    int[] arr = {4, 3, 2, 9, 1, 5, 8, 3, 7, 4};
    countingSort(arr);
  }

  static void countingSort(int[] arr) {
    int range = 9; // Else find max
    int count[] = new int[range + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    for (int i = 1; i < range + 1; i++) {
      int currentCount = count[i - 1] + count[i];
      count[i] = currentCount;
    }

    int[] result = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      result[--count[arr[i]]] = arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        System.out.print("{ ");
      }
      System.out.print(result[i]);
      if (i != arr.length - 1) {
        System.out.print(", ");
      } else {
        System.out.print(" }");
      }
    }
  }
}