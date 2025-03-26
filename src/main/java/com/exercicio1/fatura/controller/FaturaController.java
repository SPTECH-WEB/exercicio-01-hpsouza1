package com.exercicio1.fatura.controller;

import com.exercicio1.fatura.model.FaturaModel;
import com.exercicio1.fatura.repository.FaturaRepository;
import com.exercicio1.fatura.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private FaturaRepository repository;
    private FaturaService service;



    public FaturaController(FaturaRepository repository, FaturaService service) {
        this.repository = repository;
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FaturaModel> create( @RequestBody FaturaModel model){
        FaturaModel fatura = service.salvarFatura(model);
        return ResponseEntity.ok().body(fatura);
    }

    @GetMapping
    public ResponseEntity<List<FaturaModel>> findAll(){
        return ResponseEntity.ok(service.listarFaturas());
    }

}
