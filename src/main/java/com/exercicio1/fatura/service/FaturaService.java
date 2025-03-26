package com.exercicio1.fatura.service;

import com.exercicio1.fatura.repository.FaturaRepository;
import com.exercicio1.fatura.model.FaturaModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository repository;

    public FaturaService(FaturaRepository repository) {
        this.repository = repository;
    }

    public FaturaModel salvarFatura(FaturaModel fatura) {
        return repository.save(fatura);
    }

    public List<FaturaModel> listarFaturas() {
        return repository.findAll();
    }

}
