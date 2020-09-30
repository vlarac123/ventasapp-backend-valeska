package com.vlara.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlara.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
