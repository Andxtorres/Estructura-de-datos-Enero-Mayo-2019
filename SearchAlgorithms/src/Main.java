
public class Main {
	
	public static void main(String args[]) {
		Alumno a= new Alumno("A0121194",null);
		a.setMatricula("A0121194");
		Alumno a1= new Alumno("A0121194",null);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a==a1);
		System.out.println(a.compareTo(a1));
		Search<Alumno> search= new Search<>();
		Alumno[] alumnoArray= new Alumno[5];
		alumnoArray[0]= new Alumno("A01650183","Jessica");
		alumnoArray[1]=new Alumno("A01653348","Jorge");
		alumnoArray[2]=new Alumno("A01654319","Alejandro");
		alumnoArray[3]= new Alumno("A01654725","Aldo");
		alumnoArray[4]=new Alumno("A01655772","Oscar");
		System.out.println(search.binarySearch(alumnoArray, new Alumno("A01653348",null)));
		System.out.println(search.binarySearchRec(alumnoArray, new Alumno("A01653348",null)));

	}

}
