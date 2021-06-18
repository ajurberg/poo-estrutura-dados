package br.com.letscode.java;

public class SelectionSort {

    int[] array = {47, 1, 34, 19, 78, 23, 4, 43, 11, -31};

    public void ordenar() {
        for (int i = 0; i < this.array.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[j] < this.array[menor]) {
                    menor = j;
                }
            }
            int temp = this.array[menor];
            this.array[menor] = this.array[i];
            this.array[i] = temp;
        }
    }

    public void visualizarArray() {
        BubbleSort.imprimeArray(this.array);
    }

}
