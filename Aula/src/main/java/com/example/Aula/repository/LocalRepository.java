package com.example.Aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Aula.entities.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
   
}
