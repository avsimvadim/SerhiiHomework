package kiev;
//your task will be to sort this array from min to max [4,3,5,34,5,6,3,6,0,3,-3,-57,3333]
public class Main {
    public static void main(String[] args) {
        int[] Array = {4,3,5,34,5,6,3,6,0,3,-3,-57,3333};
        int tmp;
        for (int i = 0; i < Array.length; i++) {//This cycle runs through elements of array from it pre-last index to beginning
            for (int j = Array.length-1; j>i; j--) { //This cycle runs from first index to last
                if (Array[j] < Array[j-1]) { // swappin bigger niggas to the right,far away from white dudes
                    tmp = Array[j-1];
                    Array[j-1] = Array[j];
                    Array[j] = tmp;
                }
                                           }System.out.print(Array[i]+" ");
             }
        System.out.println();

                System.out.println("My dick length,(inches)--->"+Array.length); //Length of nigga dick
                }

}

