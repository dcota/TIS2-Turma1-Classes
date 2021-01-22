public class Pessoa {
    //atributos
    private String nomePessoa;
    private int idadePessoa;
    private int ccPessoa;
    private int tlmPessoa;
    private boolean resTestePessoa = false;

    //contrutor
    public Pessoa(String nome, int idade, int cc, int tlm){
        this.nomePessoa = nome;
        this.idadePessoa = idade;
        this.ccPessoa = cc;
        this.tlmPessoa = tlm;
    }

    //métodos de set
    public void setNomePessoa (String nome){
        this.nomePessoa = nome;
    }
    public void setIdadePessoa (int idade){
        this.idadePessoa = idade;
    }
    public void setCcPessoa (int cc){
        this.ccPessoa = cc;
    }
    public void setTlmPessoa (int tlm){
        this.tlmPessoa = tlm;
    }
    public void setResTestePessoa (boolean res){
        this.resTestePessoa = res;
    }

    //métodos de get
    public String getNomePessoa(){
        return this.nomePessoa;
    }
    public int getIdadePessoa(){
        return this.idadePessoa;
    }
    public int getCcPessoa(){
        return this.ccPessoa;
    }
    public int getTlePessoa(){
        return this.tlmPessoa;
    }
    public boolean getResTestePessoa(){
        return this.resTestePessoa;
    }
}
