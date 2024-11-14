package com.senaidev.saraiva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.saraiva.entities.Livro;
import com.senaidev.saraiva.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public List<Livro> getAllLivros(){
		return livroRepository.findAll();
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
	
}
