package program;

public class Main {
    public static void main(String[] args) {

        //Algoritmo bubble sort

        int[] v = {2,4,6,1,10};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i -1; j++) {
            if (v[j] > v[j+1]) {
                int aux = v[j];
                v[j] = v[j+1];
                v[j+1] = aux;
            }
            }
        }
        System.out.print("bubble sort: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+", ");
        }
    }
}
