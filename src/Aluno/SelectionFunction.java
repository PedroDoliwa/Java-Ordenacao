package Aluno;

public class SelectionFunction {

    public static void notaCresente(Aluno[] alunos){   // metodo ordena em ordem Cresente um vetor com base na media dos alunos
        int n = alunos.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (alunos[j].calcularMedia() < alunos[min].calcularMedia()) {
                    min = j;
                }
            }
            Aluno aux = alunos[min];
            alunos[min] = alunos[i];
            alunos[i] = aux;
        }
    }

    public static Aluno[] aprovados(Aluno[] aluno){     // metodo retorna um Vetor ordenado em ordem alfabetica os alunos com media >+ 7

        int n = aluno.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if((aluno[j].getNome().compareToIgnoreCase(aluno[min].getNome()) < 0)){
                    min = j;
                }
                Aluno aux = aluno[min];
                aluno[min] = aluno[i];
                aluno[i] = aux;
            }
        }

        int countAp = 0;
        for(Aluno a : aluno) {
            if (a.calcularMedia() >= 7) {
                countAp++;
            }
        }

        Aluno[] aprovados = new Aluno[countAp];
            int n2 = aprovados.length;
            int count = 0;
            for (int i = 0; i < aluno.length; i++) {
                if (aluno[i].calcularMedia() >= 7) {
                    aprovados[count] = aluno[i];
                    count++;
                }
            }
        return aprovados;
    }

    public static Aluno[] reprovados(Aluno[] aluno){        // metodo retorna um Vetor ordenado em ordem alfabetica os alunos com media < 7

        int n = aluno.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if((aluno[j].getNome().compareToIgnoreCase(aluno[min].getNome()) < 0)){
                    min = j;
                }
                Aluno aux = aluno[min];
                aluno[min] = aluno[i];
                aluno[i] = aux;
            }
        }

        int countRp = 0;
        for(Aluno a : aluno) {
            if (a.calcularMedia() < 7) {
                countRp++;
            }
        }

        Aluno[] aprovados = new Aluno[countRp];
        int n2 = aprovados.length;
        int count = 0;
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i].calcularMedia() < 7) {
                aprovados[count] = aluno[i];
                count++;
            }
        }
        return aprovados;
    }

    public static void imprimir(Aluno[] alunos) {       // metodo para imprimir todo o vetor
        for (Aluno aluno : alunos) {
            System.out.println(aluno + " ");
        }
        System.out.println();
    }
}
