package ar.edu.unju.fi.model;

public class RegistroNotas {
	private String codigo;
	private Alumno alumno;
	private materia materia;
	private Float notaFinal;
	
	public RegistroNotas() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNotas(String codigo, Alumno alumno, ar.edu.unju.fi.model.materia materia, Float notaFinal) {
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}
	

	@Override
	public String toString() {
		return "RegistroNotas: Codigo: " + codigo + ", Alumno=" + alumno + ", Materia=" + materia + ", NotaFinal="
				+ notaFinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public materia getMateria() {
		return materia;
	}

	public void setMateria(materia materia) {
		this.materia = materia;
	}

	public Float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	

}
