import java.util.*;
public class GesTestes {
    public static void main(String[] args){
        //instanciação de 6 objetos
        Pessoa p1 = new Pessoa("João Borges",34,123456789,111111111);
        Pessoa p2 = new Pessoa("Ana Santos",40,223456789,111111111);
        Pessoa p3 = new Pessoa("Carlos Marques",76,323456789,111111111);
        Pessoa p4 = new Pessoa("Manuel Borges",56,423456789,111111111);
        Pessoa p5 = new Pessoa("Vítor Magalhães",86,523456789,111111111);
        Pessoa p6 = new Pessoa("João Marques",70,623456789,111111111);

        //declaração de uma lista de pessoas (instância ArrayList)
        ArrayList<Pessoa> pessoasTestadas = new ArrayList<Pessoa>();

        //adicionar objetos à lista
        pessoasTestadas.add(p1);
        pessoasTestadas.add(p2);
        pessoasTestadas.add(p3);
        pessoasTestadas.add(p4);
        pessoasTestadas.add(p5);
        pessoasTestadas.add(p6);

        //mostrar pessoas do grupo de risco (idade >= 65 anos)
        int numPessoasRisco = pessoasRisco(pessoasTestadas);
        System.out.println("Número de pessoas de risco: " + numPessoasRisco);

        //alterar o resultado do teste
        System.out.println("LISTA ANTES DA ALTERAÇÃO DO RESULTADO");
        printLista(pessoasTestadas);
        alteraResultado(pessoasTestadas, 223456789, true);
        alteraResultado(pessoasTestadas, 423456789, true);
        alteraResultado(pessoasTestadas, 623456789, true);
        System.out.println("LISTA DEPOIS DA ALTERAÇÃO DO RESULTADO");
        printLista(pessoasTestadas);

        //pessoas infetadas e média de idades dos infetados
        System.out.println("LISTA DE INFETADOS E MÉDIA DE IDADES");
        printNomesInfetados(pessoasTestadas);
    }

    //método para contar as pessoas de risco
    public static int pessoasRisco(ArrayList<Pessoa> pessoasTestadas){
        int contagem=0;
        for(int i=0; i<pessoasTestadas.size(); i++){
            if(pessoasTestadas.get(i).getIdadePessoa() >= 65){
                contagem++;
            }
        }
        return contagem;
    }

    public static void alteraResultado(ArrayList<Pessoa> pessoasTestadas, int cc, boolean resultado){
        for(int i=0; i<pessoasTestadas.size(); i++){
            if(pessoasTestadas.get(i).getCcPessoa() == cc){
                pessoasTestadas.get(i).setResTestePessoa(resultado);
                break;
            }
        }   
    }

    public static void printNomesInfetados(ArrayList<Pessoa> pessoasTestadas){
        int contador=0;
        int somaIdades=0;
        for(Pessoa p : pessoasTestadas){
            if(p.getResTestePessoa() == true){
                System.out.println(p.getNomePessoa() + " | " + p.getIdadePessoa());
                contador++;
                somaIdades+=p.getIdadePessoa();
            }
        }
        double media = (double) somaIdades / contador;
        System.out.println("Média das idades dos infetados: " + media);
    }

    public static void printLista(ArrayList<Pessoa> pessoasTestadas){
        for(int i=0; i<pessoasTestadas.size(); i++){
            System.out.println(pessoasTestadas.get(i).getNomePessoa() + " | " + pessoasTestadas.get(i).getResTestePessoa());
        }
    }
}
