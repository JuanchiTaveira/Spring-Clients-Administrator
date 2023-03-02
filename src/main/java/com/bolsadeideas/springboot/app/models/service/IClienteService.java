package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Factura;
import com.bolsadeideas.springboot.app.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	List<Cliente> findAll();
	
	Page<Cliente> findAll(Pageable pageable);

	void save(Cliente cliente);
	
	Cliente findOne(Long id);
	
	void delete(Long id);

	List<Producto> findByNombre(String term);

	void saveFactura(Factura factura);

	Producto findProductoById(Long id);

	Factura findFacturaById(Long id);

	void deleteFactura(Long id);

	Factura fetchFacturaByIdWithClienteWithItemFacturaWithProducto(Long id);
}
