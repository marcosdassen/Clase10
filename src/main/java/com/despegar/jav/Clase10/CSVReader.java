package com.despegar.jav.Clase10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

	private String fileName;
	private List<Restaurante> restaurantes;

	public CSVReader(String fileName) {
		super();
		restaurantes = new ArrayList<Restaurante>;
		this.fileName = fileName;
	}
	
	public void levantarArchivo() {
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                boolean activo = country[1]=="true";
                Restaurante restaurante = new Restaurante(country[0], activo, Float.parseFloat(country[2]), Integer.parseInt(country[3]), country[4], country[5], country[6]);

                restaurantes.add(restaurante);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	public List<Restaurante> getRestaurantes(){
		
		return restaurantes;
	}
}
