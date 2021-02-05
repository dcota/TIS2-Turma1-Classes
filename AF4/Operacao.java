package AF4;

public class Operacao {
    //atributos
    private double num1;
    private double num2;
    private String operacao;

    //construtor
    public Operacao(double num1, double num2, String operacao){
        this.num1=num1;
        this.num2=num2;
        this.operacao=operacao;
    }

    //sets
    public void setNum1(double num1){
        this.num1=num1;
    }
    public void setNum2(double num2){
        this.num2=num2;
    }
    public void setOperacao(String operacao){
        this.operacao=operacao;
    }

    //gets
    public double getNum1(){
        return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }
    public String getOperacao(){
        return this.operacao;
    }

    //método para as operações
    public double resultado(){
        double res=0;
        if(this.operacao.equals("+")){
            res = this.num1 + this.num2;
        }
        if(this.operacao.equals("-")){
            res = this.num1 - this.num2;
        }
        if(this.operacao.equals("*")){
            res =  this.num1 * this.num2;
        }
        if(this.operacao.equals("/")) {
            res = (double) this.num1 / this.num2;
        }
        return res;
    }
}
