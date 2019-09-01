package com.prashanth.os.sorting.algorithms.practice;

public class Quicksort {

  public static void main(String[] args) {
    int[] array = {15, 3, 9, 8, 5, 2, 7, 1, 6, 1, 1, 3};
    quicksort(array, 0, array.length - 1);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  static void quicksort(int[] array, int left, int right) {
    if (left >= right) {
      return;
    }

    int pivot = array[(left + right) / 2];
    int index = partition(array, left, right, pivot);
    quicksort(array, left, index - 1);
    quicksort(array, index, right);
  }

  static int partition(int[] array, int left, int right, int pivot) {
    while (left < right) {
      while (array[left] < pivot) {
        left++;
      }

      while (array[right] > pivot) {
        right--;
      }

      if (left <= right) {
        if (array[left] != array[right]) {
          int temp = array[right];
          array[right] = array[left];
          array[left] = temp;
        }

        left++;
        right--;
      }
    }

    return left;
  }
}
