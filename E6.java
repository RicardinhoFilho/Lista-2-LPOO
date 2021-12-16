
package com.mycompany.lista_2;
import java.util.Scanner;

/*
Faça um programa em Java que peça ao usuário para digitar um texto e informe quantos
caracteres possui o texto informado pelo usuário. (Utilize o método length())
*/
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu texto:");

        String userText = scanner.nextLine();  // Read user input
        System.out.println("Tamanho do texto: " + userText.length() + " caracteres");  // Output user input
    }
    
}
