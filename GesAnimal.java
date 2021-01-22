import java.util.ArrayList;
public class GesAnimal {
    public static void main(String[] args){
        //declarar 6 instância de animais
        Animal animal1 = new Animal("Lua", 7, "Duarte", 111111111, "Cão", "Serra da Estrela", 'F' );
        Animal animal2 = new Animal("Panda", 13, "Duarte", 111111111, "Cão", "Mistura", 'M' );
        Animal animal3 = new Animal("Leo", 3, "Duarte", 111111111, "Gato", "Persa", 'M' );
        Animal animal4 = new Animal("Smarty", 7, "Duarte", 111111111, "Gato", "Mistura", 'F' );
        Animal animal5 = new Animal("Bobi", 7, "Mário", 111111111, "Cão", "Pastor Alemão", 'M' );
        Animal animal6 = new Animal("Pantufa", 7, "Jorge", 111111111, "Gato", "Siamês", 'F' );

        ArrayList<Animal> pacientes = new ArrayList<Animal>();
        pacientes.add(animal1);
        pacientes.add(animal2);
        pacientes.add(animal3);
        pacientes.add(animal4);
        pacientes.add(animal5);
        pacientes.add(animal6);
        //mostrar o nome de todos os animais
        printNomes1(pacientes);
        //contar os animais do genero feminino
        System.out.println("Total de animais do género feminino: " + contaFemininos(pacientes));
        //mostrar o nme do animal e do dono se for um cão
        mostraDonosCaes(pacientes);   
    }

    public static void printNomes1(ArrayList<Animal> pacientes){
        for(int i=0; i < pacientes.size(); i++){
            System.out.println(pacientes.get(i).getNome());
        }
    }

    public static void printNomes2(ArrayList<Animal> pacientes){
        for(Animal i : pacientes){
            System.out.println(i.getNome());
        }
    }

    public static int contaFemininos(ArrayList<Animal> pacientes) {
        int contador=0;
        for(int i=0; i<pacientes.size(); i++) {
            if(pacientes.get(i).getGenero() == 'F'){
                contador++;
            }
        }
        return contador;
    }

    public static void mostraDonosCaes(ArrayList<Animal> pacientes){
        for(int i=0; i<pacientes.size(); i++) {
            if(pacientes.get(i).getEspecie().equals("Cão")){
                System.out.println(pacientes.get(i).getNome() + " | " + pacientes.get(i).getDono());
            }
        }
    }
}
