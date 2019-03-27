/* 01/08/2018 - Jogo de Adivinhação (em 10 tentativas)
1 - Clase Random: gerar um número Rondômico (0,100)
atribuir em uma variável
2 - Leitura de um número
3 - Testa o número lido com o número gerado
Se Maior: "Você errou, digite um número menor."
Senão: "Você errou, digite um número maior."
4 - Em caso de acerto:
Parabéns, você acertou, o número era XX.
Você utilizou X tentativas.
 */
package revisao1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    
    public static void main (String[] args){
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        int n = 0;
        int tentativas = 0;
        int sorteado;
        int numeroAleatorio = random.nextInt(10);
        System.out.println("Numero Gerado: " + numeroAleatorio);
        
        
        while(n != numeroAleatorio){
            System.out.print("Digite um numero: ");
            n = ler.nextInt();
            if (numeroAleatorio <= n)
                System.out.println("Voce errou, digite um numero menor.");
            else  
                System.out.println ("Você errou, digite um número maior.");
                       
           tentativas++;
           
           System.out.println("------ Tentativa: " + tentativas);
       }
    
        System.out.println ("Parabéns, você acertou! O número era: " + n);  
        System.out.print("Numero tentativas: " + tentativas);
        System.out.println();
    }
        
}  