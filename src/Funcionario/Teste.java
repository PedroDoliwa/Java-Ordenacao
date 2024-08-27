package Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Pedro", 4000);
        Funcionario func2 = new Funcionario("Joao", 15000);
        Funcionario func3 = new Funcionario("Ana", 5000);


        Funcionario[] funcionarios = {func, func2, func3};


        //BubbleFunction.ordemAlfabetica(funcionarios);

        //BubbleFunction.salarioCrescente(funcionarios);

        BubbleFunction.salarioDecrescente(funcionarios);
        BubbleFunction.imprimir(funcionarios);

    }
}
