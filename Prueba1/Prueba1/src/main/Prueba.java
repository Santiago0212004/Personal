package main;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		int casos, n;
		
		Scanner sc = new Scanner(System.in);
		
		casos = sc.nextInt();
		
		for(int i=0; i<casos; i++) {
			n = sc.nextInt();
			
			long[] numeros = new long[n];
			
			
			for(int j = 0; j<n; j++) {
				numeros[j] = sc.nextInt();
			}
			
			
			int exponente = 0;
			
			while(tienePar(numeros)) {
				for(int j = 0; j<n; j++) {
					if(numeros[j]%2==0) {
						numeros[j] = numeros[j]/2;
						exponente++;
					}
				}
			}
			
			
			long mayor = 0;
			int posicion = 0;
			
			for(int j=0; j<n; j++) {
				if(numeros[j]>mayor) {
					mayor = numeros[j];
					posicion = j;
				}
			}
			
			
			double numeroFinal = mayor*(Math.pow(2, exponente));
			
			numeros[posicion] = (long) numeroFinal;
			
			long respuesta = 0;
			
			for(int j=0; j<n; j++) {
				respuesta+= numeros[j];
			}
				
			
			System.out.println(respuesta);
			
		}

	}
	
	public static boolean tienePar(long[] numeros) {
		boolean par = false;
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]%2==0) {
				par = true;
			}
		}
		return par;
	}

}
