/*Faça um programa que leia um número inteiro do teclado, e imprima na tela se
o mesmo é Par ou Ímpar. A seguir, pergunte: Continuar? Sim ou Não.
 */
package revisao1;
import java.util.Scanner;
public class TestParImpar {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        int number;

        String option = "Sim";       
        
        while (option.equalsIgnoreCase("Sim")){ //equals testa se string é igual . IgnoreCase: ignora maisculas e minusculas para fazer o teste
            
            System.out.print("Digite um número: ");
            number = read.nextInt();
            
            if (number % 2 == 0 ){
                System.out.println("O número " + number + " é Par"); 
            }else{
                System.out.println("O número " + number + " é Ímpar");
                }
            
            System.out.println("");
            System.out.println("Continuar? [Sim] ou [Não]: ");
            option = read.next();
            System.out.println("");
        }
        
        System.out.println("FIM!!");
               
    }
    
    
}