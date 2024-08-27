package Funcionario;

public class BubbleFunction {

    public static void salarioCrescente(Funcionario[] funcionario) {            // Ordena o Vetor por ordem Cresente de Salario
        int n = funcionario.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if((funcionario[j].getSalario()) > (funcionario[j + 1].getSalario())){
                    Funcionario aux = funcionario[j];
                    funcionario[j] = funcionario[j + 1];
                    funcionario[j + 1] = aux;

                }
            }
        }
    }

    public static void salarioDecrescente(Funcionario[] funcionario) {      // Ordena o Vetor por ordem Decresente de Salario
        int n = funcionario.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if((funcionario[j].getSalario()) < (funcionario[j + 1].getSalario())){
                    Funcionario aux = funcionario[j];
                    funcionario[j] = funcionario[j + 1];
                    funcionario[j + 1] = aux;

                }
            }
        }
    }


    public static void ordemAlfabetica(Funcionario[] funcionarios) {        // Ordena o Vetor por nome em ordem Alfabetica
        int n = funcionarios.length;

        for (int i = 0; i < n -1; i++) {
            for(int j = 0; j < n - i - 1; j++){
                if(funcionarios[j].getNome().compareTo(funcionarios[j+1].getNome()) > 0){
                    Funcionario aux = funcionarios[j];
                    funcionarios[j] = funcionarios[j+1];
                    funcionarios[j+1] = aux;
                }
            }
        }
    }

    public static void imprimir(Funcionario[] funcionarios) {       // Imprime todo o vetor
        for(Funcionario vet : funcionarios){
            System.out.print(vet + " ");
        }
        System.out.println();
    }
}
