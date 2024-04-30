package Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem {
	
	private List<FileSystem> contenido;
	
	public Directorio(String nombre,LocalDate fechaCreacion) {
		super(nombre,fechaCreacion);
		this.contenido = new ArrayList<FileSystem>();
	}
	
	
	public void agregar(FileSystem a) {
		this.contenido.add(a);
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.contenido.stream().mapToInt(d -> d.tamanoTotalOcupado()).sum() + 32;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream().map(a -> a.archivoMasGrande()).filter(e -> e != null).max((e1, e2) -> Integer.compare(e1.tamanoTotalOcupado(), e2.tamanoTotalOcupado())).orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.contenido.stream().map(a -> a.archivoMasNuevo()).filter(e -> e != null).max((e1, e2) -> e1.getFecha().compareTo(e2.getFecha())).orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
		if (this.nombre.equals(nombre))
			return this;
		return this.contenido.stream().map(a -> a.buscar(nombre)).filter(e -> e != null).findFirst().orElse(null);
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> lista = new ArrayList<FileSystem>();
		if(this.nombre.equals(nombre)) {
			lista.add(this);
		}
		lista.addAll(this.contenido.stream().flatMap(a -> a.buscarTodos(nombre).stream()).collect(Collectors.toList()));
		return lista;
		
	}

	@Override
	public List<String> listarContenido() {
		String rutaActual = "/" + this.nombre;
		List<String> lista = new ArrayList<String>();
		lista.add(rutaActual);
		lista.addAll(this.contenido.stream().flatMap(a -> a.listarContenido().stream()).map(ruta -> rutaActual + ruta).collect(Collectors.toList()));
		
		
		return lista;
	}




}
