package turismodelatierramedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lectordearchivos {
	
	public static List<Usuario> leerArchivoUsuarios(){
		
		File f = new File("files/Usuarios.txt");
		Scanner sc;
		List<Usuario> usuarios = new LinkedList<Usuario>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");

				usuarios.add(
					new Usuario(
						line[0], 
						line[1], 
					    Double.parseDouble(line[2]),
					    Integer.parseInt(line[3])
					)
				);
				
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		return usuarios;
	}
	
	public static List<Atraccion> leerArchivoAtraccion(){
		
		File f = new File("files/Atracciones.txt");
		Scanner sc;
		List<Atraccion> atracciones = new LinkedList<Atraccion>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");

				atracciones.add(
					new Atraccion(
						line[0], 
						Double.parseDouble(line[1]), 
					    Integer.parseInt(line[2]),
					    Integer.parseInt(line[3]),
					    line[4]
					)
				);
				
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		return atracciones;
	}

	public static List<Promocion> leerArchivoPromocion(){

		File f = new File("files/Promociones.txt");
		Scanner sc;
		List<Promocion> promociones = new LinkedList<Promocion>();
		String[] line;
		Atraccion[] atrac;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");
                atrac = sc.nextAtraccion.split(",");
				if (line[0] == "1"){
				
				promociones.add(
					new Promocionporcentual(
						line[1], 
						line[2], 
					    Double.parseDouble(line[3])
					)
				} else if (line[0] == "2") {
					new Promocionabsoluta(
						line[1], 
						line[2], 
					    Double.parseDouble(line[3])
					)}
				else {
					new Promocionaxb(
							line[1], 
							line[2], 
						    (line[3])
						)
				}
				
				line = null;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
	}
	}
}
