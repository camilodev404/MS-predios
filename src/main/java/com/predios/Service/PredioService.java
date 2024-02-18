package com.predios.Service;

import com.predios.Model.Predio;
import com.predios.Repository.PredioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PredioService {

    @Autowired
    PredioRepository predioRepository;

    public List<Predio> getAll(){
        return predioRepository.findAll();
    }

    public Optional<Predio> getById(String idPredio){
        return predioRepository.findById(idPredio);
    }

    public Predio save(Predio predio){
        return predioRepository.save(predio);
    }

    public Predio update(Predio predio){
        return predioRepository.save(predio);
    }

}
