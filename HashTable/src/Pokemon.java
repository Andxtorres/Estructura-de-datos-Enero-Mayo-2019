
public class Pokemon {
	private String nombre;
	private int numero;
	
	public Pokemon(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int hashCode() {
		return numero;
	}
	
	@Override
	public boolean equals(Object o) {
		Pokemon p= (Pokemon)o;
		return p.hashCode()==hashCode();
		
	}
	
	public String toString() {
		return nombre;
	}
	
	

}
