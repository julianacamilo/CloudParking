package com.cloudingpark.cloudingpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudingpark.cloudingpark.models.*;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
	

}
