import java.util.ArrayList;
import java.util.Scanner;
public class GesAlunos {
    public static void main(String[] args) {
         // instanciar alunos com construtor que incializa atributos/campos
        Aluno aluno1 = new Aluno("Maria Matos", 15, "Rua do C++, 54", 98765432, "email1@enta.pt", 18.7f);
        Aluno aluno2 = new Aluno("Carlos Manuel", 19, "Rua do Java, 54", 12121212, "email2@enta.pt", 15.3f);
        Aluno aluno3 = new Aluno("Mário Matos", 20, "Rua do HTML, 54", 3232323, "email3@enta.pt", 10.6f);
        Aluno aluno4 = new Aluno("Carla Silva", 16, "Rua do PHP, 54", 98899899, "email4@enta.pt", 9.1f);
        Aluno aluno5 = new Aluno("Mariana Rebelo", 21, "Rua do Python, 54", 65656126, "email5@enta.pt", 8.4f);

        //criar uma turma = ArrayList de alunos
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        //mostrar todos os alunos
        printNomes(alunos);

        //contar os alunos menores de idade
        System.out.println("O número de menores da turma é: " + contaMenores1(alunos));
        contaMenores2(alunos);

        //consultar informações de um aluno a partir do seu num CC
        Scanner in = new Scanner(System.in);
        System.out.print("Número do CC: ");
        int numCC = in.nextInt();
        consultaAluno(numCC,alunos);
        in.close();
    }

    public static void consultaAluno(int numCC, ArrayList<Aluno> alunos){
        boolean encontrou = false;
        for(int i=0; i<alunos.size(); i++){
            if(numCC == alunos.get(i).getCC()){
                encontrou = true;
                System.out.println(alunos.get(i).getNome());
                System.out.println(alunos.get(i).getIdade());
                System.out.println(alunos.get(i).getMorada());
                System.out.println(alunos.get(i).getCC());
                System.out.println(alunos.get(i).getEmail());
                System.out.println(alunos.get(i).getMediaNotas());
            }
        }
        if(encontrou==false){
            System.out.println("Aluno não encontrado...");
        }
    }

    public static void printNomes(ArrayList<Aluno> alunos){
        for(int i=0 ; i < alunos.size() ; i++){
            System.out.println(alunos.get(i).getNome());
        }
    }

    public static int contaMenores1(ArrayList<Aluno> alunos){
        int contagemMenores=0;
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getIdade() < 18) {
                contagemMenores++;
            }
        }
        return contagemMenores;
    }

    public static void contaMenores2(ArrayList<Aluno> alunos){
        int contagemMenores=0;
        for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getIdade() < 18) {
                contagemMenores++;
            }
        }
        System.out.println("O número de menores da turma é: " + contagemMenores);
    }
}