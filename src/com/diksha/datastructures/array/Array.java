package com.diksha.datastructures.array;

import java.util.Scanner;

public class Array {

  int[] randomData;

  public Array(int size) {
    if (size > 0)
      randomData = new int[size];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    Array array = new Array(length);
    Sort sort = new Sort();
    array.populateArray();
    array.printArray();
    sort.insertionSort(array.randomData);
    //sort.bubbleSort(array.randomData);
    System.out.println("After sorting");
    array.printArray();
  }

  public void populateArray() {
    if (randomData != null) {
      for (int i = 0; i < randomData.length; i++) {
        randomData[i] = (int) (Math.random() * 10000);
      }
    } else {
      System.out.println("Invalid size entered");
    }
  }

  public void printArray() {
    for (int i = 0; i < randomData.length; i++) {
      System.out.println(randomData[i]);
    }
  }
}
