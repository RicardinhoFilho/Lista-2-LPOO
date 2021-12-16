/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;
import java.util.Scanner;

/**
 Faça um programa que leia 5 nomes e os armazene um vetor de String. Ordene-os sem
utilizar as funções da API e apresente-os em ordem alfabética.
 */
public class E9 {
    public static void main(String[] args) {
        String[] names = new String[5];
//        int[] nameOrder = {0,1,2,3,4};
        
        String temp = "";
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Insira um nome (" + (i+1) + "/5):");

            names[i] = scanner.nextLine();  // Read user input
        }
        
        for(int i = 0; i < 5; i++){
            char[] chars = names[i].toCharArray();
            
            for(int j=0;j<5;j++){
                if(j != i){
                    char[] nextChars = names[j].toCharArray();

                    if(chars[0] > nextChars[0]){
                        temp = names[j];
                        names[j] = names[i];
                        names[i] = temp;
                        temp = "";
                    } else if (chars[0] == nextChars[0]){
                        boolean sameChar = true;
                        int charsIndex = 1;
                        int nextCharsIndex = 1;

                        while(sameChar == true && 
                                charsIndex < chars.length && 
                                nextCharsIndex < nextChars.length){
                            if(chars[charsIndex] > nextChars[nextCharsIndex]){
                                sameChar = false;
                                temp = names[j];
                                names[j] = names[i];
                                names[i] = temp;
                                temp = "";
                            } else if(chars[charsIndex] <  nextChars[nextCharsIndex]) {
                                break;
                            }
                            else {
                                charsIndex++;
                                nextCharsIndex++;
                            }
                        }
                    }
                }
            
            }
            
        }
        
        for(String name : names){
            System.out.println(name);
        }
        
        
    }
    
}
