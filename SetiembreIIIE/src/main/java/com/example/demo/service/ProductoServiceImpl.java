package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository rerpositorio;
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		rerpositorio.save(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		rerpositorio.saveAndFlush(producto);

		

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		rerpositorio.deleteById(id);	

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return rerpositorio.findAll();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return rerpositorio.findById(id),orElse(new Producto());
	}

}
