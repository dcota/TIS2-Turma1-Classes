package AF3;

public class Aluno {
    //atributos da classe Aluno
    private String nome;
    private int idade;
    private String email;
    private float mediaNotas;

    public Aluno(String nome, int idade, String email, float mediaNotas){
        this.nome=nome;
        this.idade=idade;
        this.email=email;
        this.mediaNotas=mediaNotas;
    }

    //setters ou métodos de set
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setMediaNotas(float mediaNotas){
        this.mediaNotas=mediaNotas;
    }

    //getters ou métodos de get
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getEmail(){
        return this.email;
    }
    public float getMediaNotas(){
        return this.mediaNotas;
    }
}
