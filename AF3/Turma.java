package AF3;
import java.util.ArrayList;

public class Turma {
    //atributos
    private String idTurma;
    private ArrayList <Aluno> alunos;

    //construtor
    public Turma(String idTurma, ArrayList<Aluno> alunos){
        this.idTurma=idTurma;
        this.alunos=alunos;
    }
    //getters
    public String getIdTurma(){
        return this.idTurma;
    }
    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }
    //setters
    public void setIdTurma(String idTurma){
        this.idTurma=idTurma;
    }
    public void setAlunos(ArrayList<Aluno> alunos){
        this.alunos=alunos;
    }

    public int alunosMenores() {
        int contador=0;
        for(int i=0; i < alunos.size() ; i++){        
            if(alunos.get(i).getIdade() < 18){
                contador++;
                System.out.println(alunos.get(i).getNome());
            }
        }
        System.out.println("Total de alunos menores: " + contador);
        return contador;
    }

    public int mediaPositiva(){
        int contador=0;
        System.out.println("Alunos da " + idTurma + " com média positiva:");

        /*for(int i=0; i<alunos.size(); i++){
            if(alunos.get(i).getMediaNotas() >= 10){
                contador++;
                System.out.println(alunos.get(i).getNome());
            }
        }*/

        for(Aluno i: alunos){
            if(i.getMediaNotas() >= 10){
                contador++;
                System.out.println(i.getNome());
            }
        }
        System.out.println("Total de alunos com média positiva: " + contador);
        return contador;
    }
}
