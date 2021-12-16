/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;
import java.util.Scanner;

/**
 Faça um programa que leia 10 palavras e apresente o título “prefixo” e a lista das palavras
que tenham um mesmo sufixo (no mínimo de um caractere em comum na lista). Na sequência
apresente “sufixo” e a lista das palavras com um mesmo sufixo.

 */
public class E11 {
    
    public static void main(String[] args) {        
        String[] words = getWords(10);
        
        System.out.println("\nPrefixo:");
        
        for(int i =0;i<10;i++){
            int prefixCount = 0;
            String prefix = words[i] + " ";
            for(int j=0;j<10;j++){
                if(i!=j){
                    char[] iWord = words[i].toLowerCase().toCharArray();
                    char[] jWord = words[j].toLowerCase().toCharArray();
                    if(iWord[0] == jWord[0]){
                        prefixCount++;
                        prefix = prefix + words[j] + " ";
                    }
                }
            }
            if(prefixCount > 0){
                System.out.println(prefix);   
            }
        }
        
        System.out.println("\nSufixo:");
        
        for(int i =0;i<10;i++){
            int suffixCount = 0;
            String suffix = words[i] + " ";
            for(int j=0;j<10;j++){
                if(i!=j){
                    char[] iWord = words[i].toLowerCase().toCharArray();
                    char[] jWord = words[j].toLowerCase().toCharArray();
                    if(iWord[iWord.length-1] == jWord[jWord.length-1]){
                        suffixCount++;
                        suffix = suffix + words[j] + " ";
                    }
                }
            }
            if(suffixCount > 0){
                System.out.println(suffix);   
            }
        }
    }
    
    
    public static String[] getWords(int size){
        String[] result = new String[size];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<size;i++){
            System.out.println("Insira sua frase (" + (i+1) + "/" + size + "):");

            String userText = scanner.nextLine();  // Read user input
            
            result[i] = userText;
        }
        
        return result;
    }
    
}