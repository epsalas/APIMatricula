package com.apimatricula.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import java.util.UUID;

import com.apimatricula.demo.model.Matricula;

@RestController
@RequestMapping(value = "api/productos", produces = "application/json")

public class MatriculaController {
    private Map<String, Matricula> matriculas;

    public MatriculaController(){
        matriculas = new HashMap<String,Matricula>();

        Matricula p = new Matricula();
        p.setNombre("nombre");
        p.setCarrera("carrera");
       
        p.setFechaNacimiento(new Date());
        p.setGenero("genero");
        /*String id = UUID.randomUUID().toString();
        p.setID(id);

        matriculas.put(id,p); */
    }

    @GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String,Matricula>> all(){
        return new ResponseEntity<Map<String,Matricula>>(
            matriculas, HttpStatus.OK);
    } 

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Matricula> find(@PathVariable String id){
        if(matriculas.containsKey(id)){
            Matricula p = matriculas.get(id);
            return new ResponseEntity<Matricula>(p, HttpStatus.OK);
        }else{
            return new ResponseEntity<Matricula>(HttpStatus.NOT_FOUND);
        }
    }
}
