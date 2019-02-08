
public class Alumno implements Comparable<Alumno> {
	
	private String matricula;
	private String nombre;
	
	
	public Alumno(String matricula, String nombre) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Alumno o) {
		return matricula.compareTo(o.getMatricula());
	}
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + "]";
	}
	
	
}
