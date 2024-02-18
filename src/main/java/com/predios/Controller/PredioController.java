package com.predios.Controller;

import com.predios.Model.Predio;
import com.predios.Service.PredioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/predio")
@CrossOrigin("*")
public class PredioController {

    @Autowired
    PredioService predioService;

    @GetMapping("/all")
    public ResponseEntity<List<Predio>> getPredios(){
        return new ResponseEntity<>(predioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{idPredio}")
    public ResponseEntity<Predio> predioById(@PathVariable("idPredio") String idPredio){
        return predioService.getById(idPredio).map(predio -> new ResponseEntity<>(predio, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Predio> guardarPredio(@RequestBody Predio predio){
        return new ResponseEntity<>(predioService.save(predio), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Predio> updatePredio(@RequestBody Predio predio){
        return new ResponseEntity<>(predioService.update(predio), HttpStatus.OK);
    }

}
