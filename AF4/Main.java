package AF4;

import java.util.*;

public class Main {

    public static void main(String[] args){
        boolean terminar=false;
        Scanner input = new Scanner(System.in);
        while(terminar==false){
            //pedir os dados ao utilizador (1º passo)
            System.out.print("introduza o número 1: ");
            double num1 = input.nextDouble();
            System.out.print("introduza o número 2: ");
            double num2 = input.nextDouble();
            System.out.print("introduza operação (+,-,/,*): ");
            String operacao = input.next();
            while(validaOperacao3(operacao) == false){
                System.out.print("Operação inválida! Deve inserir +, -, / ou *? Tente outra vez: ");
                operacao = input.next();
            }
            //declarar objeto da classe Operacao (2º passo)
            Operacao op = new Operacao(num1,num2,operacao);

            //calcular e mostrar o resultado (3º passo)
            double resultado = op.resultado();
            System.out.println("Resultado: " + resultado);

            System.out.print("Nova operação? (s/n): ");
            String opcao = input.next();
            while(validaSaida(opcao)==false){
                System.out.print("Escolha inválida. Introduza s ou n: ");
                opcao=input.next();
            }
            if(opcao.toLowerCase().equals("n")){
                terminar=true;
            }
        }
        input.close();
        System.out.println("Até à próxima!");
    }

    public static boolean validaSaida(String opcao){
        boolean valida = false;
        if(opcao.toLowerCase().equals("s") || opcao.toLowerCase().equals("n")){
            valida=true;
        }
        return valida;
    }

    public static boolean validaOperacao1(String operacao){
        boolean validado=false;
        switch(operacao){
            case "+": validado=true;
            case "-": validado=true;
            case "/": validado=true;
            case "*": validado=true;
        }
        return validado;
    }

    public static boolean validaOperacao2(String operacao){
        boolean validado=false;
        if(operacao.equals("+") || operacao.equals("-") || operacao.equals("/") || operacao.equals("*")){
            validado=true;
        }
        return validado;
    }

    public static boolean validaOperacao3(String operacao){
        boolean validado=false;
        String[] operacoes = {"+", "-", "/", "*"};
        for(int i=0; i<operacoes.length; i++){
            if(operacao.equals(operacoes[i])){
                validado=true;
            }
        }
        return validado;
    }

}
