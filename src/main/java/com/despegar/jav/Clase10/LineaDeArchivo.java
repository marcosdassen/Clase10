package com.despegar.jav.Clase10;

public class LineaDeArchivo {
	private String id;
	private boolean activo;
	private Float costoPorSemana;
	private Integer recomendaciones;
	private String zona;
	private String nombre;
	private String telefono;
	public LineaDeArchivo(String id, boolean activo, Float costoPorSemana, Integer recomendaciones, String zona,
			String nombre, String telefono) {
		super();
		this.id = id;
		this.activo = activo;
		this.costoPorSemana = costoPorSemana;
		this.recomendaciones = recomendaciones;
		this.zona = zona;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public String getId() {
		return id;
	}
	public boolean isActivo() {
		return activo;
	}
	public Float getCostoPorSemana() {
		return costoPorSemana;
	}
	public Integer getRecomendaciones() {
		return recomendaciones;
	}
	public String getZona() {
		return zona;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	
	public boolean esDeZona(String zona) {
		return this.zona == zona;
	}

}
