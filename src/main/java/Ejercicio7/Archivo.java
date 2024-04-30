package Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archivo extends FileSystem {

	private int tamanio;
	
	public Archivo(String nombre,LocalDate fechaCreacion,int tamanio) {
		super(nombre,fechaCreacion);
		this.tamanio=tamanio;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.tamanio;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public FileSystem buscar(String nombre) {
		if(this.getNombre().equals(nombre)) {
			return this;
		}
		return null;
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> lista = new ArrayList<FileSystem>();
		if(this.getNombre().equals(nombre)) {
			lista.add(this);
		}
		return lista;
	}

	@Override
	protected List<String> listarContenido() {
		return Arrays.asList("/" + this.nombre);
	}
	
	

}
