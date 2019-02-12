
public class Boleto {
	
	
	public Boleto(String nombre) {
		super();
		this.nombre = nombre;
	}

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Boleto [nombre=" + nombre + "]";
	}
	

}
