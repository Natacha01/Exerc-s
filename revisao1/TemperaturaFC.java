/* 2. Faça um programa em Java que leia uma temperatura em graus Fahrenheit,
calcule e mostre o valor correspondente em graus Celsius;
c/5 = F − 32/9. 
F x C = °C = (°F − 32) ÷ 1,8
C x F = °F = °C × 1,8 + 32
 */
package revisao1;
import java.util.Scanner;
public class TemperaturaFC {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        float fahrenheit = 0;
        float celsius = 0;
        float calculation = 0;
        
        System.out.print("Digite a Temperatura em Fahrenheit: ");
        fahrenheit = read.nextFloat();
        
        calculation = (float) ((fahrenheit - 32) / 1.8);
        
        System.out.println("Em graus Celsius: " + calculation);
        
    }
    
}

