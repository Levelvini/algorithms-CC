package program.algorithms;

public class QuickSort {
    public static void quickSort(int[] vect,int left,int right){
        if (left<right){
            int p = particao(vect,left,right);
        }
    }
    public static int particao(int[] vect, int left, int right) {
        int mid = (int) (left + right) / 2;
        int pivot = vect[mid];
        int i = left -1;
        int j = right +1;
        while (true){
            do {
                i++;
            }while (vect[i]< pivot);
            do {
                j--;
            }while (vect[j]> pivot);
            if (i >= j){
                return j;
            }
            int aux = vect[i];
            vect[i] = vect[j];
            vect[j] = aux;
        }
    }
}
