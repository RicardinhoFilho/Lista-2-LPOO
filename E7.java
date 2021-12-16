/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;
import java.util.Scanner;
/*
 Faça um programa que leia uma frase, verifique se a maioria dos caracteres estão em
maiúsculas, se tiver converta a frase para minúscula e apresente-a, caso contrário, converte
para maiúscula e apresente-a.
 */
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frase:");

        String userText = scanner.nextLine();  // Read user input
        
        int upperCount = 0;
        
        
        for (int i = 0; i < userText.length(); i++) {
            if (Character.isUpperCase(userText.charAt(i))) upperCount++;
        }
        
        if(upperCount > (userText.length()/2)){
            System.out.println(userText.toUpperCase()); 
        } else {
            System.out.println(userText.toLowerCase()); 
        }
    }
    
}