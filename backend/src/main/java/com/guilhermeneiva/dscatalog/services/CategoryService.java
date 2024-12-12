package com.guilhermeneiva.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermeneiva.dscatalog.entities.Category;
import com.guilhermeneiva.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> buscar() {
		return repository.findAll();
	}

}
