package com.vlara.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlara.model.Venta;

public interface IVentaRepo  extends JpaRepository<Venta, Integer>{

}
