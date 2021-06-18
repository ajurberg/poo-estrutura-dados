package br.com.letscode.java;

public class MergeSort {

    /**
     * from: https://www.geeksforgeeks.org/merge-sort/
     *
     * MergeSort(arr[], l,  r)
     * If r > l
     *      1. Find the middle point to divide the array into two halves:
     *              middle m = l+ (r-l)/2
     *      2. Call mergeSort for first half:
     *              Call mergeSort(arr, l, m)
     *      3. Call mergeSort for second half:
     *              Call mergeSort(arr, m+1, r)
     *      4. Merge the two halves sorted in step 2 and 3:
     *              Call merge(arr, l, m, r)
     */

    int[] array = {47, 1, 34, 19, 78, 23, 4, 43, 11, -31};

    // Junta dois subarrays de array[]
    // O primeiro subarray é array[l..m]
    // O segundo subarray é array[m+1..r]
    public void merge(int array[], int l, int m, int r) {

        // Determina o tamanho dos 2 subarrays a serem percorridos
        int h1 = m - l + 1;
        int h2 = r - m;

        // Cria os subarrays temporários
        int L[] = new int[h1];
        int R[] = new int[h2];

        // Copia os dados para os subarrays temporários
        for (int i = 0; i < h1; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < h2; j++) {
            R[j] = array[m + 1 + j];
        }

        // Junta os arrays temporários
        int i = 0, j = 0;
        int k = l;
        while (i < h1 && j < h2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de L[], caso existam
        while (i < h1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de R[], caso existam
        while (j < h2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Ordena array[l..r] usando merge()
    public void ordenar(int array[], int l, int r) {
        if (l < r) {
            // Encontra o ponto médio
            int m = l + (r - l)/2;

            // Ordena os subarrays
            ordenar(array, l, m);
            ordenar(array, m + 1, r);

            // Merge
            merge(array, l, m, r);
        }
    }

    public void visualizarArray() {
        BubbleSort.imprimeArray(array);
    }

}
