package program;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,4,6,1,10,7,9,3,12,21,7};
        int[] b = new int[25];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) Math.floor(Math.random() * b.length);
        }
        //Algoritmo bubble sort

        bubbleSort(a);
        bubbleSort(b);
        System.out.print("bubble sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.print("bubbleSort: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+", ");
        }
    }
    private static int[] bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i -1; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }return v;
    }
   // --------------------------------------------------------------------------

    //algoritmo quicksort

}
