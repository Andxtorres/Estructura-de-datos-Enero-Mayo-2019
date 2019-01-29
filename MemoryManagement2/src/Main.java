
public class Main {

	public static void main(String[] args) {
		Character c1= new Character();
		c1.name="Goku";
		Character c2= new Character();
		c2.name="Vegetta";
		Character c3= new Character();
		c3.name="Piccolo";
		exchange(c1,c2,c3);
		System.out.println("C1: "+c1.name+" C2: "+c2.name+" C3: "+c3.name);
		

	}
	
	private static void exchange(Character c1,Character c2,Character c3) {
		Character temp=c1;
		temp.name="Yamcha";
		c2=c3;
		c3=temp;
		c3.name="Bulma";
		temp=c1;
		temp.name="Broly";
		temp=c2;
		temp.name="Majin Boo";
	}

}
