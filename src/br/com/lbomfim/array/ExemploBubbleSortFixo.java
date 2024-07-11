package br.com.lbomfim.array;

/**
 * O BubbleSort vai ordenar o array.
 * Exemplo: {2, 4, 1, 5, 3} -> {1, 2, 3, 4, 5}
 *
 * @author Lucas
 */

public class ExemploBubbleSortFixo {

    public static void main(String[] args) {
        int[] vet = {8, 9, 3, 5, 1};
        int aux = 0;
        int i = 0;

        System.out.println("Vetor original: ");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for(i = 0; i<5; i++){
            for(int j = 0; j<4; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
    }
}
