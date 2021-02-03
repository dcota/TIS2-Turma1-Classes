

import java.util.*;

public class Main {

    public static void main(String[] args){
        boolean terminar=false;
        while(terminar==false){
            Scanner input = new Scanner(System.in);
            System.out.print("introduza o número 1: ");
            double num1 = input.nextDouble();
            System.out.print("introduza o número 2: ");
            double num2 = input.nextDouble();
            System.out.print("introduza operação (+,-,/,*): ");
            String operacao = input.next();

            Operacao op = new Operacao(num1,num2,operacao);

            double resultado = op.resultado();
            System.out.println("Resultado: " + resultado);
            System.out.print("Nova operação? (s/n)");
            String opcao = input.next();
            if(opcao.equals("n")){
                terminar=true;
            }
        }
        System.out.println("Até à próxima!");
    }

}
