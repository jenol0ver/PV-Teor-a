package ar.edu.unju.fi.model;

public class materia {
	private String codigo;
	private String nombre;
	
	public materia() {
		// TODO Auto-generated constructor stub
	}

	public materia(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Nombre: " + nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
