package com.despegar.jav.Clase10;

import java.io.BufferedReader;

public class CSVReader {

	private String fileName;

	public CSVReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void levantarArchivo() {
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	public Restaurante[] getRestaurantes(){
		
		return null;
	}
}
