/* 31/08/2018 - Ler x; Ler y; Ler Z - (X-5*Y-Z).
* 1. Faça um programa em Java que leia do teclado os valores para as variáveis X, Y
e Z e mostre o resultado da expressão:
X − 5 ∗ Y − Z.
 */
package revisao1;

import java.util.Scanner;

public class FuncaoXYZ {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x; 
        int y; 
        int z;
        int resultado;
        
        System.out.println("Digite um valor para X = ");
        x = ler.nextInt();
        
        System.out.println("Digite um valor para Y = ");
        y = ler.nextInt();
        
        System.out.println("Digite um valor para Z = ");
        z = ler.nextInt();
        
        resultado = (x-(5*y)-z);
        
        System.out.println("Resultado=  " + resultado);
        
    }
    
}
