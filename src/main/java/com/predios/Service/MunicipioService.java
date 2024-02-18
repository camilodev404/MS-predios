package com.predios.Service;

import com.predios.Model.Municipio;
import com.predios.Repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;

    public List<Municipio> getAll(){
        return municipioRepository.findAll();
    }

    public Optional<Municipio> getById(String idMunicipio){
        return municipioRepository.findById(idMunicipio);
    }

    public List<Municipio> getByDepto(String idDepto){
        return municipioRepository.findByDepto(idDepto);
    }

}
