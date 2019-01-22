
public class Main {
	
	public static void main(String args[]) {
		User u= new User("Oscar");
		//Box with Object
		Box b = new Box(u);
		User userFromBox= (User)b.getO();
		System.out.println(userFromBox.getName());
		
		//Generic Box
		GenericBox<User> genericBox= new GenericBox<>(u);
		System.out.println(genericBox.getObject().getName());
		
		GenericBox2<User,String> genericBox2= new GenericBox2<>(new User("Andres"),"A01211914");
	}
}
