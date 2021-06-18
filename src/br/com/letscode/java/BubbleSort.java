package br.com.letscode.java;

public class BubbleSort {

    int[] array = {47, 1, 34, 19, 78, 23, 4, 43, 11, -31};

    public void ordenar() {
        for (int i = 0; i < this.array.length - 1; i++) {
            for (int j = 0; j < this.array.length - i - 1; j++) {
                if (this.array[j] > this.array[j+1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = temp;
                }
            }
        }
    }

    public void visualizarArray() {
        imprimeArray(this.array);
    }

    static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length-1]) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "\n");
            }
        }
    }
}
