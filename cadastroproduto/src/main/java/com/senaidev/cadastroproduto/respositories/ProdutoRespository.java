package com.senaidev.cadastroproduto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroproduto.entities.Produto;

public interface ProdutoRespository extends JpaRepository<Produto, Long>{

}
