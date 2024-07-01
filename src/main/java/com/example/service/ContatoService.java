package com.example.service;


import com.example.dominio.model.Contato;

public interface ContatoService {

    Contato findById(Long id);

    Contato create(Contato contatoToCreate);
}
