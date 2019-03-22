
public class Main {
	
	public static void main(String args[]) {
		
		Pokemon pikachu= new Pokemon("Pikachu",25);
		
		Pokemon picachu= new Pokemon("Picachu",25);
		Pokemon graveler= new Pokemon("Graveler",75);
		Pokemon dodrio= new Pokemon("Dodrio",85);
		
		System.out.println("El Hashcode de pikachu es : "+pikachu.hashCode());
		System.out.println("El Hashcode de picachu es : "+picachu.hashCode());
		System.out.println("La comparación es : "+picachu.equals(pikachu));
		
		
		HashTable<Integer,Pokemon> pokedex= new HashTable<>(10);
		pokedex.insert(pikachu.hashCode(), pikachu);
		pokedex.insert(graveler.hashCode(), graveler);
		pokedex.insert(dodrio.hashCode(), dodrio);
		pokedex.print();
		System.out.println(pokedex.getValue(95));
		
		
		
	}
	

}
