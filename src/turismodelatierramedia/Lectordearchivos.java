package turismodelatierramedia;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lectordearchivos {
	
	public void leerArchivoUsuarios(){
		
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
	}
	
	public void leerArchivoAtraccion(){
		
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
	}

	public void leerArchivoPromocion(){

		File f = new File("files/Promociones.txt");
		Scanner sc;
		List<Promocion> promociones = new LinkedList<Promocion>();
		String[] line;
		
		try {
			sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				line = sc.nextLine().split("-");

				if (equal(Integer.parseInt(line[0]), 1)){
				
				promociones.add(
					new Promocion(
						line[0], 
						line[1], 
					    Double.parseDouble(line[2])
					)
				);} else if (line[0] = 2) {}
				else {}
				
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
