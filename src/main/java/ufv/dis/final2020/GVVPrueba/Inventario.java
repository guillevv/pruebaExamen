package ufv.dis.final2020.GVVPrueba;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<Producto> productos;

	public Inventario() {
		this.productos = new ArrayList<Producto>();
	}
	
	
	public void AddProduct(Producto p) {
		this.productos.add(p);
	}
	
	public void removeProduct(Producto p) {
		this.productos.remove(p);
	}
	
	
	
}
