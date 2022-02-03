
package lux;
import java.util.Scanner;


public class Lux {

    
    public static void main(String[] args) {
        
        
        String nome[];
               
        nome = new String [5];
        pegarNome(nome);
        int[] nascimento = new int [5];
        calcularIdade(nascimento);
        exibirResultado();
        
        
        
        
       
    }

    private static void calcularIdade(int[] nascimento) {
        int z;
        Scanner scan = new Scanner(System.in);
        int Idade[] = new int [5];
        for(z = 0; z < 5; z++){
            System.out.println("Digite o ano de nascimento: ");
            nascimento[z] = scan.nextInt();
            Idade[z] = 2000 - nascimento [z];
            
        }
            
        
    }

    private static void pegarNome(String[] nome) {
        int x;
        Scanner scan = new Scanner(System.in);
        for (x = 0; x < 5; x ++){
            System.out.println("Digite o Nome: ");
            nome[x] = scan.nextLine();
        }
    }

    private static void exibirResultado() {
        
    
    }
    
}
