package com.exercicio1.fatura.repository;

import com.exercicio1.fatura.model.FaturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaRepository extends JpaRepository<FaturaModel, Long> {

}