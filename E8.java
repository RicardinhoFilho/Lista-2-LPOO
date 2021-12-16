/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista_2;

import java.util.Scanner;

/**
Faça um programa que leia uma frase, quebre a frase em palavras e imprima cada palavra
em uma linha (String.split)
 */
public class E8 {
    public static void main(String[] args) {
        String[] splitted;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua frase:");

        String userText = scanner.nextLine();  // Read user input
        
        splitted = userText.split(" ");
        
        System.out.println(" ");
        for(String word : splitted){
            System.out.println(word);
        }
    }
    
}
