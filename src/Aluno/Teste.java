package Aluno;

public class Teste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Pedro",9,10);
        Aluno a2 = new Aluno("Ana",7,10);
        Aluno a3 = new Aluno("Joao",5,5);
        Aluno a4 = new Aluno("Matheus",6,9);
        Aluno a5 = new Aluno("Rafael",8,6);
        Aluno a6 = new Aluno("Maria",4,2);
        Aluno a7 = new Aluno("Lucas",5,7);
        Aluno a8 = new Aluno("Laura",4,9);

        Aluno[] alunos = {a1,a2,a3,a4,a5,a6,a7,a8};



        SelectionFunction.notaCresente(alunos);
        SelectionFunction.imprimir(alunos);

        Aluno[] aprovado = SelectionFunction.aprovados(alunos);
        Aluno[] reprovado = SelectionFunction.reprovados(alunos);

        SelectionFunction.imprimir(aprovado);
    }
}
