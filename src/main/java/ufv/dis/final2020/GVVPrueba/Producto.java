package ufv.dis.final2020.GVVPrueba;

public class Producto {
	
	public String nombre;
	public String categoria;
	public String precio;
	public String ean13;
	
	
	
	public Producto(String nombre, String categoria, String precio, String ean13) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.ean13 = ean13;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getEan13() {
		return ean13;
	}
	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}
	
	
	
}
