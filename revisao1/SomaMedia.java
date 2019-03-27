/*Faça um programa em Java que leia três nomes e três idades 
E imprima a soma e a média das três idades.
 */
package revisao1;
import java.util.Scanner;
public class SomaMedia {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        String nome;
        int idade = 0;
        int total = 0;
        int media = 0;
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Digite um Nome: ");
            nome = read.next();
        
            System.out.print("Digite uma Idade: ");
            idade = read.nextInt();
            System.out.println("");
        }
        
        total = idade + idade + idade;
        media = total / 3;
        
        System.out.println("Soma das Idades: " + total);
        System.out.println("A média das idades é: " + media);
   
    }
    
}