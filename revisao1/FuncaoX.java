/* 31/08/2018 - x²-5x+6.
15/08/2018 - Crie um programa Java para exibir os valores da função F(x) = x² - 5x + 6 para
valores de x digitados pelo teclado, até que o usuário digite zero para x.
 */
package revisao1;

import java.util.Scanner;

public class FuncaoX {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = -1; 
        int resultado;
        
        while ( x != 0 ){
        System.out.print("Digite um valor para X = ");
        x = ler.nextInt();
                    
        resultado = ((x*x)-(5*x)+6);
        
        System.out.println("Resultado =  " + resultado);
        }
    }
}
    