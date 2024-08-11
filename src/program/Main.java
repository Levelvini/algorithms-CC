package program;

import program.algorithms.MergeSort;

import static program.algorithms.BubbleSort.bubbleSort;
import static program.algorithms.MergeSort.mergeSort;
import static program.algorithms.QuickSort.quickSort;

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
        System.out.println();

        // --------------------------------------------------------------------------

        //algoritmo quick sort

        quickSort(a,0,a.length -1);
        quickSort(b,0,b.length - 1);
        System.out.print("quickSort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.print("quickSort: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+", ");
        }
        System.out.println();

        //-----------------------------------------------------------------------------

        // algoritmo merge sort

        MergeSort.mergeSort(a);
        MergeSort.mergeSort(b);
        System.out.print("mergeSort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.print("mergeSort: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+", ");
        }
        System.out.println();
    }
    }
