package com.diksha.datastructures.array;

public class Delete {

  public boolean delete(int[] array, int index) {
    if (index < array.length && array != null) {
      for (int i = index; i < array.length - 1; i++) {
        array[i] = array[i + 1];
      }
      return true;
    } else {
      System.out.println("Delete was unsuccessful with index" + index);
      return false;
    }
  }
}
