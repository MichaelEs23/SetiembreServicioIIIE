package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;

@Repository
public class ProductoRepositoryImp implements ProductoRepository {
	
	List<Producto> almacenamiento = new ArrayList<>();

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		almacenamiento.add(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		Producto existeActualizar = obtener(producto.getIdProducto());
		eliminar(producto.getIdProducto());
		almacenamiento.add(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);

		

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		
		almacenamiento.stream().filter(p->p.getIdProducto()==id).findFirst().orElse(null);
		
		
		return null;
	}

}
