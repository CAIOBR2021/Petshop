package com.caio.petshop.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caio.petshop.domain.Categoria;
import com.caio.petshop.domain.Produto;
import com.caio.petshop.repository.CategoriaRepository;
import com.caio.petshop.repository.ProdutoRepository;

@Component
public class PopulaDados {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	
	@PostConstruct
	public void cadastrar() {
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "Remédio");
		Categoria cat3 = new Categoria(null, "Cosmético");
		
		Produto p1 = new Produto(null,"Ração", 100.00);
		Produto p2 = new Produto(null,"Sache", 80.00);
		Produto p3 = new Produto(null,"Vermifugo", 20.00);
		Produto p4 = new Produto(null,"Shampoo", 50.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2));
		cat2.getProdutos().addAll(Arrays.asList(p3, p4));
		cat3.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		p4.getCategorias().addAll(Arrays.asList(cat2, cat3));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		
	}
	
}
