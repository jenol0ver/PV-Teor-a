package ar.edu.unju.fi.main;
import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.RegistroNotas;
import ar.edu.unju.fi.model.materia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		int numMaterias = 1;
				
		while (numMaterias < 5) {
			System.out.println("\nIngrese el codigo de la Materia: ");
			String codigoMateria = scanner.next();
			
			System.out.println("Ingrese el nombre de la Materia: ");
			String nombreMateria = scanner.next();
			
			materia materia = new materia(codigoMateria, nombreMateria);
			
			System.out.println("\nIngrese el codigo de registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float notaFinal = scanner.nextFloat();
			
			RegistroNotas registroNota = new RegistroNotas(codigoNota, alumno, materia, notaFinal);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
			
			
			
			
		}
	}

}
