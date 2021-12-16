/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;
import java.util.Scanner;

/**
 Faça um programa que leia uma frase e imprima se a frase é ou não palíndromo. O
programa deve ignorar espações, símbolos não alfabéticos e variação de caixa.
 */
public class E13 {

      public static void main(String[] args) {  
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu texto:");

        String userText = scanner.nextLine();  // Read user input
        
        if(isPalindrome(userText)){
            System.out.println("PALINDROMO");
        } else {
            System.out.println("NÃO É PALINDROMO");
        }
        

    }
    
    public static String reverseString(String originalString){
        char[] original = originalString.toCharArray();
        char[] reversedArray = new char[original.length];
        int j = original.length;
        for (int i = 0; i < original.length; i++) {
            reversedArray[j - 1] = original[i];
            j = j - 1;
        }
        
        return String.valueOf(reversedArray);
        
    }
    
    
    public static boolean isPalindrome(String text){
        String formattedText = text.toLowerCase();
        String reversed = reverseString(formattedText);
        
        if (reversed.equals(formattedText)){
            return true;
        }
        return false;
    }
}
