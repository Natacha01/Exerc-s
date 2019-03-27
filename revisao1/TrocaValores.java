/* 3. Faça um programa em Java que receba dois valores fornecidos pelo usuário, efetue
a troca destes valores e apresente os valores trocados. Baseie-se no exemplo de
execução abaixo, mas lembre-se que é apenas um exemplo. Os valores fornecidos
por um usuário qualquer podem ser diferentes dos fornecidos. 
 */
package revisao1;
import java.util.Scanner;
public class TrocaValores {
    public static void main (String[] args){
        
        Scanner read = new Scanner(System.in);
        int value1;
        int value2;
        
        System.out.print("Digite o primeito valor: ");
        value1 = read.nextInt();
        
        System.out.print ("Digite o segundo valor: ");
        value2 = read.nextInt();
        
        System.out.println("");
        
        System.out.println ("Os valores trocados são: " + value2 + " , " + value1);
    }
}
