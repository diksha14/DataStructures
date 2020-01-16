package com.diksha.algorithms;

public class Sort {

  public void bubbleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public void insertionSort(int[] array) {
    for (int j = 1; j < array.length; j++) {
      int key = array[j];
      int i = j - 1;
      while (i >= 0 && array[i] > key) {
        array[i + 1] = array[i];
        i = i - 1;
      }
      array[i + 1] = key;
    }
  }

  public void mergeSort(int[] array) {

  }

  public void quickSort(int[] array) {

  }

  public void heapSort(int[] array) {

  }

  public void radixSort(int[] array) {

  }

  public void bucketSort(int[] array) {

  }

}
