package paquete1;

import java.util.Scanner;

public class Programa3A {

	public static void main(String[] args) {
		String nom;
		byte ed;
		float al;
		Scanner l=new Scanner (System.in);
		System.out.println("�Cual es t� nombre?");
		nom=l.nextLine();
		System.out.println("�Cu�l es t� edad?");
	    ed=l.nextByte();
		System.out.println("�Cu�l es t� altura?");
		al=l.nextFloat();
        
		Persona a=new Persona();
		a.setNom(nom);
		a.setEd(ed);
		a.setAl(al);
		
		System.out.println(a);
		
 }
}
