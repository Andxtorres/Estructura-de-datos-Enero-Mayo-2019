
public class Estudiante implements Comparable<Estudiante>{
	
	private String nombre;
	private String matricula;
	private double calificacion;
	
	
	

	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public double getCalificacion() {
		return calificacion;
	}




	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public int compareTo(Estudiante e) {
		return matricula.compareTo(e.getMatricula());
	}
	
	
}
