package paquete1;

public class Animal {
      public String c;
      public int p;
      public Animal(){
    	  this.c="cafe";
    	  this.p=4;
      }
      public Animal(String c, int p){
    	  this.c=c;
    	  this.p=p;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Animal b=new Animal("Negro", 4);
		System.out.println("Hola mundo");
		
	}

}
