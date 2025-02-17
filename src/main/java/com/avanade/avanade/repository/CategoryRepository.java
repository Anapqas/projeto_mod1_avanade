package com.avanade.avanade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.avanade.avanade.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
  @Query("SELECT c FROM Category c WHERE c.nome = :nome")
  List<Category> findByNome(String nome);
  // List<Categoria> findByNome(@Param("nome") String nome);
}
