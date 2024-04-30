package com.predios.Controller;

import com.predios.Model.Municipio;
import com.predios.Service.MunicipioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/municipio")
@CrossOrigin("*")
@Tag(name = "Municipios")
public class MunicipioController {

    @Autowired
    MunicipioService municipioService;

    @GetMapping("/all")
    public ResponseEntity<List<Municipio>> getMunicipios(){
        return new ResponseEntity<>(municipioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/depto/{idDepto}")
    public ResponseEntity<List<Municipio>> getByDepto(@PathVariable("idDepto")String idDepto){
        List<Municipio> municipios = municipioService.getByDepto(idDepto);
        return new ResponseEntity<>(municipios, HttpStatus.OK);
    }

    @GetMapping("/{idMunicipio}")
    public ResponseEntity<Municipio> municipioById(@PathVariable("idMunicipio") String idMunicipio){
        return municipioService.getById(idMunicipio).map(municipio -> new ResponseEntity<>(municipio, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
