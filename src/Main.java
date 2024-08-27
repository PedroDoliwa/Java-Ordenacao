//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] vetorBubble = {4,12,3,76,52,9};
        int[] vetorSelection = {10,19,2,89,14,7,22};
        int[] vetorInsertion = {6,78,10,1,56,14,2};


//        Ordenacao.imprimeVetor(vetor);
//        //ordernar.bubbleSort(vetor);
//        Ordenacao.selectionSort(vetor);
//        Ordenacao.imprimeVetor(vetor);

//        Ordenacao.imprimeVetor(vetorInsertion);
//        Ordenacao.insertionSort(vetorInsertion);
//        Ordenacao.imprimeVetor(vetorInsertion);

        Ordenacao.bubbleSortDecrescente(vetorBubble);
        Ordenacao.imprimeVetor(vetorBubble);




    }
}