package com.example.service.impl;


import com.example.dominio.model.Contato;
import com.example.dominio.repository.ContatoRepository;
import com.example.service.ContatoService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ContatoServiceImpl implements ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoServiceImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }



    @Override
    public Contato findById(Long id) {
        return contatoRepository.findById(id).orElseThrow(NoSuchElementException::new);

    }

    @Override
    public Contato create(Contato contatoToCreate) {
        if (contatoRepository.existsByContatoNome(contatoToCreate.getNome())) {
            throw new IllegalArgumentException("This Contact already exists.");
        }
        return contatoRepository.save(contatoToCreate);
    }
}
