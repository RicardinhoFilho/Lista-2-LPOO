/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;

/**
Faça um método que receba uma String como parâmetro, remova todas as vogais dessa
String e retorne o conteúdo (String).
import java.util.Scanner;

*/

import java.util.Scanner;
public class E10 {
    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua string");

        String userText = scanner.nextLine();  // Read user input
        
        String result = removeVowels(userText);
        
        System.out.println(result);
        
    }
    
    
    public static String removeVowels(String text){
        int length = text.length();
        char[] chars = text.toCharArray();
        String result;
        
        for(int i=0;i<length;i++){
            char currentChar = chars[i];
            if("AEIOUaeiou".indexOf(currentChar) != -1){
                chars[i] = 0;
            }
        }
        
        return String.valueOf(chars);
    }
    
}
