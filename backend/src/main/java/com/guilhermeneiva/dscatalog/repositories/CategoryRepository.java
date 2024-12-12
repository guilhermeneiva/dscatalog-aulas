package com.guilhermeneiva.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeneiva.dscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
