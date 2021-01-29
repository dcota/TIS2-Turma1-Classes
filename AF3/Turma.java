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
}
