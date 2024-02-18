package com.predios.Service;

import com.predios.Model.Departamento;
import com.predios.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<Departamento> getAll(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> getById(String idDepto){
        return departamentoRepository.findById(idDepto);
    }

}
