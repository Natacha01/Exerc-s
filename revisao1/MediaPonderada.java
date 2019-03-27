/* 4. Faça um programa em Java que receba (leitura do teclado) 3 notas e seus
respectivos pesos, calcule e mostre a média ponderada dessas notas.

Média Ponderada = (Nota 1 ∗ Peso da Nota 1) + (Nota 2 ∗ Peso da Nota 2)
                  ------------------------------------------------------
                                Soma dos Pesos das Notas
 */
package revisao1;
import java.util.Scanner;
public class MediaPonderada {
    public static void main (String[] args){
        
        Scanner read = new Scanner(System.in);
        float note1, note2, note3;
        float weight1, weight2, weight3;
        float mWeighted = 0; // Media Ponderada
        float sumWeight = 0;
        
        System.out.print("Digite a primeira nota: ");
        note1 = read.nextFloat();        
        System.out.print("Digite o peso da primeira nota: ");
        weight1 = read.nextFloat();
        
        System.out.println("");
        System.out.print("Digite a segunda nota: ");
        note2 = read.nextFloat();
        System.out.print("Digite o peso da segunda nota: ");
        weight2 = read.nextFloat();
        
        System.out.println("");
        System.out.print("Digite a terceira nota: ");
        note3 = read.nextFloat();
        System.out.print("Digite o peso da terceira nota: ");
        weight3 = read.nextFloat();
        
        sumWeight = (weight1 + weight2 + weight3);
        mWeighted = (((note1 * weight1) + (note2 * weight2) + (note3 * weight3)) / sumWeight);
        
        System.out.println("");
        System.out.println("Média Ponderada: " + mWeighted);
    }
    
}