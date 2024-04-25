/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;
import java.util.Scanner;

/**
 *
 * @author danielaugusto
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lê os valore de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();
        
        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;   
        }
        //TODO criar as demais condiçòes para as aliquotas de 10.00% e 15.00%
        
        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
    
}
