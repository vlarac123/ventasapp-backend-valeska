package com.vlara.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.vlara.model.CompraProducto;
//@Repository
public interface ICompraProductoRepo extends JpaRepository<CompraProducto, Integer>{
	
	
	@Modifying
	@Query("from CompraProducto cp where cp.venta.idVenta = :idVenta")
	List<CompraProducto> listarProductosVenta(@Param("idVenta") Integer idVenta);

}
