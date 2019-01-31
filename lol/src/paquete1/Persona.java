package paquete1;

public class Persona {
   private String nom;
   private byte ed;
   private float al;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public byte getEd() {
	return ed;
}
public void setEd(byte ed) {
	this.ed = ed;
}
public float getAl() {
	return al;
}
public void setAl(float al) {
	this.al = al;
}
@Override
public String toString() {
	return "Persona [nombre=" + nom + ", edad=" + ed + ", altura=" + al + "]";
 }   
}
