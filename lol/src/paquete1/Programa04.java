package paquete1;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		byte n;
			Scanner leer=new Scanner(System.in);
      
      System.out.println("¿Cuál es tu edad?");
      	n=leer.nextByte();
      	
      	if(n>=18){
      		System.out.println("Ya eres legal ¬u¬");
      	}
      	else{
      		System.out.println("No eres apto para entrar a la Escupidera de Salti");
      	}
      		
	}

}
