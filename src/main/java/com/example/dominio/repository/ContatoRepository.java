package com.example.dominio.repository;

import com.example.dominio.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

    boolean existsByContatoNome(String contatoNome);

}
