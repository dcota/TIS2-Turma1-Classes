package AF3;

import java.util.ArrayList;
import java.util.Scanner;

public class GesAlunos {
    public static void main(String[] args) {
        /****************criar dados e estrutura de dados***************************/
         // instanciar 10 alunos com construtor que incializa atributos/campos
        Aluno aluno1 = new Aluno("Maria Matos", 15, "email1@enta.pt", 18.7f);
        Aluno aluno2 = new Aluno("Carlos Manuel", 19, "email2@enta.pt", 15.3f);
        Aluno aluno3 = new Aluno("Mário Matos", 20, "email3@enta.pt", 10.6f);
        Aluno aluno4 = new Aluno("Carla Silva", 16,"email4@enta.pt", 9.1f);
        Aluno aluno5 = new Aluno("Mariana Rebelo", 15, "email5@enta.pt", 8.4f);
        Aluno aluno6 = new Aluno("Maria Silva", 18, "email1@enta.pt", 10.7f);
        Aluno aluno7 = new Aluno("Joaquim Fernandes", 17, "email2@enta.pt", 11.3f);
        Aluno aluno8 = new Aluno("Carlos Santos", 25, "email3@enta.pt", 13.6f);
        Aluno aluno9 = new Aluno("Bernardo Silva", 18,"email4@enta.pt", 9.1f);
        Aluno aluno10 = new Aluno("Joana Vasconcelos", 17, "email5@enta.pt", 8.4f);

        //criar duas listas de alunos = ArrayList de alunos
        ArrayList<Aluno> alunosA = new ArrayList<Aluno>();
        alunosA.add(aluno1);
        alunosA.add(aluno2);
        alunosA.add(aluno3);
        alunosA.add(aluno4);
        alunosA.add(aluno5);
        ArrayList<Aluno> alunosB = new ArrayList<Aluno>();
        alunosB.add(aluno6);
        alunosB.add(aluno7);
        alunosB.add(aluno8);
        alunosB.add(aluno9);
        alunosB.add(aluno10);

        //criar as turmas
        Turma turmaA = new Turma("Turma A", alunosA);
        Turma turmaB = new Turma("Turma B", alunosB);

        //criar lista de turmas
        ArrayList<Turma> todasAsTurmas = new ArrayList<Turma>();
        todasAsTurmas.add(turmaA);
        todasAsTurmas.add(turmaB);

        /******************************************************** */ 
        //mostrar dados por turma
        turmaA.alunosMenores();
        turmaB.alunosMenores();
        turmaA.mediaPositiva();
        turmaB.mediaPositiva();

        //mostrar para todas as turmas
        todosOsMenores(todasAsTurmas);
        todosAsPositivas(todasAsTurmas);
    }

    public static void todosOsMenores(ArrayList<Turma> todasAsTurmas){
        int contador=0;
        for(Turma i : todasAsTurmas){
            contador = contador + i.alunosMenores();
        }
        System.out.println("Total de alunos menores (todas as turmas): " + contador);
    } 

    public static void todosAsPositivas(ArrayList<Turma> todasAsTurmas){
        int contador=0;
        for(Turma i : todasAsTurmas){
            contador = contador + i.mediaPositiva();
        }
        System.out.println("Total de alunos com média positiva (todas as turmas): " + contador);
    }
    
}
