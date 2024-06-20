package program;

public class Main {
    public static void main(String[] args) {
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
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+", ");
        }
        for (int i = 0; i < v.length; i++) {
            if (v[0]<v[1]){
                int aux = v[0];
                v[0] = v[1];
                v[1]= aux;
            } if (v[1]<v[2]){
                int aux = v[1];
                v[1] = v[2];
                v[2]= aux;
            } if (v[2]<v[3]){
                int aux = v[2];
                v[2] = v[3];
                v[3]= aux;
            } if (v[3]<v[4]){
                int aux = v[3];
                v[3] = v[4];
                v[4]= aux;
            }

        }
        System.out.println();
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+", ");
        }
    }
}
