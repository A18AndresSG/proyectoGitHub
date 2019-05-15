/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.Scanner;

/**
 *
 * @author Andrés Spinetti
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
		//pedir frase por pantalla
		String frase;
		Scanner scanner = new Scanner(System.in);
		frase = scanner.nextLine();
		
		//Mostrar numero de "a"
		
		int contadorA = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a') {
				contadorA++;
			}
		}
		if (contadorA == 0) {
			System.out.print(" ");
		}else {
		System.out.println("a: " + contadorA);
		}	
		
		//Mostrar numero de "e"
		
		int contadorE = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'e') {
				contadorE++;
			}
			
		}
		if (contadorE == 0) {
			System.out.print(" ");
		}else {
		System.out.println("e: " + contadorE);
		}	
		
		//Mostrar numero de "i"
		
		int contadorI = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'i') {
				contadorI++;
			}
			
		}
		if (contadorI == 0) {
			System.out.print(" ");
		}else {
		System.out.println("i: " + contadorI);
		}
		
		//Mostrar numero de "o"
		
		int contadorO = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'o') {
				contadorO++;
			}
			
		}
		if (contadorO == 0) {
			System.out.print(" ");
		}else {
		System.out.println("o: " + contadorO);
		}	
		
		//Mostrar numero de "u"
		
		int contadorU = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'u') {
				contadorU++;
			}
			
		}
		if (contadorU == 0) {
			System.out.print(" ");
		}else {
		System.out.println("u: " + contadorU);
		}		
	    
	    System.out.println("Modificando mi clase desde GitHub");

	}
}
