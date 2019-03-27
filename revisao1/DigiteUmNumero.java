/*
 07/08/2018 - Digite um número: 5 (0 á 24).
 */
package revisao1;
import java.util.Scanner;
public class DigiteUmNumero {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
    
        int number;
        int cont = 1;
    
        System.out.print("Digite um número: ");
        number = read.nextInt();
    
        for(int i = 1; i <= number; i++){
            System.out.print(cont + " ");
            cont++;
            for (int j = 1; j < number; j++){
                System.out.print(cont + " ");
                cont++;
            }            
            System.out.println();
        }

    }
   
}
