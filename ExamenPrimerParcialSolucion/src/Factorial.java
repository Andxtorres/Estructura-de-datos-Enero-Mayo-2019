
public class Factorial {
	
	public static int factorial(int numero) {
		if(numero==0) {
			return 1;
		}
		if(numero==1) {
			return 1;
		}
		return numero*factorial(numero-1);
	}

}
