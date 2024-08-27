public class Ordenacao {

    public static void bubbleSort(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n -1; i++) {
            for(int j = 0; j < n - i - 1; j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public static void bubbleSortDecrescente(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n -1; i++) {
            for(int j = 0; j < n - i - 1; j++){
                if(vetor[j] < vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }



    public static void selectionSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i< n - 1; i++){
            int min = i;
            for(int j = i +1; j < n; j++){
                if(vetor[j] < vetor[min]){
                    min = j;
                }
            }
            int aux = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = aux;
        }
    }

    public static void insertionSort(int[] vetor){
        int n = vetor.length;
        for(int i = 1; i < n; i++){
            int chave = vetor[i];
            int j = i - 1;
            while(j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void imprimeVetor(int[] vetor){
        for(int vet : vetor){
            System.out.print(vet + " ");
        }
        System.out.println();
    }

}
