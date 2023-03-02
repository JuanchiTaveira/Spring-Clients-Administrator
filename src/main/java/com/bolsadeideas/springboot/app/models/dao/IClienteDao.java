package com.bolsadeideas.springboot.app.models.dao;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

    @Query("select c from Cliente c join fetch c.facturas f where c.id=?1")
    Cliente fetchByIdWithFacturas(Long id);
}
