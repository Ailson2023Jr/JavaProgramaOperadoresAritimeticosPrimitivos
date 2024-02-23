/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaoperadoraritimeticosprimitivos;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class ProgramaOperadorAritimeticosPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instaciando e criando um objeto Scanner
        Scanner ler =new Scanner (System.in);
        
        // Declaração das variáveis
        int int1;
        double real1;
        String nome;
        boolean casado;
        
        // Atribuição das variáveis
        int1 = 10;
        real1 = 20.3;
        casado = true;
        
        System.out.println("Programa operadores aritimético  e tipos primitivos em Java");
        
        // Entrada de dados
        int1 = int1 + 5;
        real1 = real1 + 4.2;
        
        
        System.out.println("\nInforme o seu nome:\n");
        nome = ler.nextLine(); //lendo uma String
        
        // Saída de dados
        System.out.println("\nResultado:\n");
        
        System.out.printf("O valor inteiro é: %d. \n", int1);
        System.out.printf("O valor real é: %2f. \n", real1);
        System.out.printf("Seu nome é: %s. \n", nome);
        System.out.printf("O valor do status casado é: %b. \n", casado);
        
    }
    
}
