public class Animal {
    //atributos
    private String nome;
    private int idade;
    private String dono;
    private int tlmDono;
    private String especie;
    private String raca;
    private char genero;
    //contrutor
    public Animal(String nome, int idade, String  dono, int tlmDono, String especie, 
        String raca, char genero){
            this.nome=nome;
            this.idade=idade;
            this.dono=dono;
            this.tlmDono=tlmDono;
            this.especie=especie;
            this.raca=raca;
            this.genero=genero;
        }
    //setters
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setDono(String dono){
        this.dono=dono;
    }
    public void setTlmDono(int tlmDono){
        this.tlmDono=tlmDono;
    }
    public void setEspecie(String especie){
        this.especie=especie;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }

    //getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getDono(){
        return this.dono;
    }
    public int getTlmDono(){
        return this.tlmDono;
    }
    public String getEspecie(){
        return this.especie;
    }
    public String getRaca(){
        return this.raca;
    }
    public char getGenero(){
        return this.genero;
    }
}
