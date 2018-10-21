package week2;

import java.util.Arrays;

//to write bubble sort and insertion sort and selection
public class APP {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

    }
}

class BubbleSort {
    void sort(int[] arr){
        //code
        System.out.println("BubbleSort" + Arrays.toString(arr));
    }
}

class InsertionSort {
    void sort(int[] arr){
        //code
    }
}