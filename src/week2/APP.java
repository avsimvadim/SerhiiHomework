package week2;

import java.util.Arrays;

//to write bubble sort and insertion sort and selection
public class APP {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
        System.out.println("ORIG" + Arrays.toString(arr));
        InsertionSort.sort(arr);
        BubbleSort.sort(arr);
        InsertionSort.sort2(arr);
        Selection.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("\n " + "Running time:");
        System.out.println(end - start);
    }
}

class BubbleSort {
    static void sort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {//This cycle runs through elements of array from it pre-last index to beginning
            for (int j = arr.length - 1; j > i; j--) { //This cycle runs from first index to last
                if (arr[j] < arr[j - 1]) { // swappin bigger niggas to the right,far away from white dudes
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //code
        System.out.println("Bubbl" + Arrays.toString(arr));
    }
}

class InsertionSort {
    static void sort(int[] arr) {
        int j, temp;
        for (int i = 1; i < arr.length; i++) { //cycle moves from 1st to prelast item
            ; //creating temp field to swap items
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j]; //swap bigger el-t
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
        System.out.println("INSE" + Arrays.toString(arr));


    }

    static void sort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
        System.out.println("Ins2" + Arrays.toString(arr));
    }
}

class Selection {
    static void sort(int[] arr) {
        int min = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            if (arr[i] != arr[index]) {
                arr[index] = arr[i];
                arr[i] = min;


            }
        }
        System.out.println("SELEC" + Arrays.toString(arr));
    }
}


