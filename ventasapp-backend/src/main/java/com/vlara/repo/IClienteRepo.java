package com.vlara.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlara.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
